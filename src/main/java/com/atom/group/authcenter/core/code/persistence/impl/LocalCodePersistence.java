package com.atom.group.authcenter.core.code.persistence.impl;

import com.atom.group.authcenter.core.code.CodeEntity;
import com.atom.group.authcenter.core.code.enums.CodePersistencePolicy;
import com.atom.group.authcenter.core.code.persistence.CodePersistence;
import com.atom.group.authcenter.core.utils.GsonUtils;
import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.Timer;
import io.netty.util.TimerTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @program: auth-center
 * @description: 本地内存持久化验证码，仅限本地使用。
 * @author: Maxxx.Yg
 * @create: 2018-10-15 15:21
 **/
public class LocalCodePersistence implements CodePersistence {

    private final static Logger logger = LoggerFactory.getLogger(LocalCodePersistence.class);

    private static final Timer ttlTimer = new HashedWheelTimer();

    private static final ConcurrentHashMap<String,List<CodeEntity>> CODE_ENTITY_CONCURRENT_HASH_MAP = new ConcurrentHashMap<>(32);

    @Override
    public void save(CodeEntity codeEntity) {
        String id = codeEntity.getId();
        List<CodeEntity> codeEntityList = null;
        if (!CODE_ENTITY_CONCURRENT_HASH_MAP.containsKey(id)){
            codeEntityList = new ArrayList<>();
            codeEntityList.add(codeEntity);
            CODE_ENTITY_CONCURRENT_HASH_MAP.put(id,codeEntityList);
            return;
        }
        codeEntityList = CODE_ENTITY_CONCURRENT_HASH_MAP.get(id);
        if (CollectionUtils.isEmpty(codeEntityList)){
            codeEntityList = new ArrayList<>();
        }
        codeEntityList.add(codeEntity);
        logger.info("验证码：{}，已存入本地",GsonUtils.getInstance().toJson(codeEntity));
        ttlTask(codeEntity);
    }

    @Override
    public Boolean match(CodeEntity codeEntity) {

        String id = codeEntity.getId();
        List<CodeEntity> codeEntityList = null;
        if (!CODE_ENTITY_CONCURRENT_HASH_MAP.containsKey(id)){
            logger.warn("手机号：{}，未找到相关验证码（key）",id);
            return false;
        }
        codeEntityList = CODE_ENTITY_CONCURRENT_HASH_MAP.get(id);
        if (CollectionUtils.isEmpty(codeEntityList)){
            logger.warn("手机号：{}，未找到相关验证码（value）",id);
            return false;
        }
        CodeEntity cache = codeEntityList.stream()
                .filter(a->a.getId().equals(codeEntity.getId()))
                .filter(a->a.getCodeType().getCodeType()==codeEntity.getCodeType().getCodeType())
                .filter(a->a.getCode().equals(codeEntity.getCode()))
                .findFirst()
                .orElse(null);

        if (cache!=null&&cache.getExpires().longValue()>=System.currentTimeMillis()){
            return true;
        }

        return false;
    }

    @Override
    public String policy() {
        return CodePersistencePolicy.LOCAL.getPolicy();
    }

    private void ttlTask(CodeEntity codeEntity){
        ttlTimer.newTimeout(new TimerTask() {
            @Override
            public void run(Timeout timeout) throws Exception {
                List<CodeEntity> codeEntityList = CODE_ENTITY_CONCURRENT_HASH_MAP.get(codeEntity.getId());
                if(CollectionUtils.isEmpty(codeEntityList)){
                    return;
                }
                CodeEntity cache = codeEntityList.stream()
                        .filter(a->a.getId().equals(codeEntity.getId()))
                        .filter(a->a.getCodeType().getCodeType()==codeEntity.getCodeType().getCodeType())
                        .filter(a->a.getCode().equals(codeEntity.getCode()))
                        .findFirst()
                        .orElse(null);
                if (cache!=null){
                    codeEntityList.remove(cache);
                }
            }
        }, codeEntity.getTtl().longValue(), TimeUnit.MILLISECONDS);
    }

    public static void main(String[] argv) {

        final Timer timer = new HashedWheelTimer();
        timer.newTimeout(new TimerTask() {

            @Override
            public void run(Timeout timeout) throws Exception {
                System.out.println("timeout 5");
            }
        }, 5, TimeUnit.SECONDS);

        timer.newTimeout(new TimerTask() {

            @Override
            public void run(Timeout timeout) throws Exception {
                System.out.println("timeout 10");
            }
        }, 10, TimeUnit.SECONDS);
    }


}
