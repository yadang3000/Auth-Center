package com.atom.group.authcenter.core.code.persistence.impl;

import com.atom.group.authcenter.core.code.CodeEntity;
import com.atom.group.authcenter.core.code.enums.CodePersistencePolicy;
import com.atom.group.authcenter.core.code.persistence.CodePersistence;
import com.atom.group.authcenter.core.context.JedisContextHolder;
import com.atom.group.authcenter.core.jedis.JedisClient;
import com.atom.group.authcenter.core.utils.GsonUtils;
import com.atom.group.authcenter.core.utils.JedisKeyUtil;
import com.google.gson.Gson;
import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.Timer;
import io.netty.util.TimerTask;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-15 15:19
 **/
public class RedisCodePersistence implements CodePersistence {

    private static final Timer ttlTimer = new HashedWheelTimer();

    private static final JedisClient JEDIS_CLIENT = JedisContextHolder.getJedisClient();

    @Override
    public void save(CodeEntity codeEntity) {
        JEDIS_CLIENT.set(JedisKeyUtil.getSMSCodeKey(codeEntity),GsonUtils.getInstance().toJson(codeEntity),codeEntity.getTtl());
        ttlTask(codeEntity);
    }

    @Override
    public Boolean match(CodeEntity codeEntity) {
        String key =JedisKeyUtil.getSMSCodeKey(codeEntity);
        String value = JEDIS_CLIENT.get(key);
        if (StringUtils.isEmpty(value)){
            return false;
        }
        CodeEntity cache = GsonUtils.getInstance().fromJson(value,CodeEntity.class);
        if (cache!=null){
            if (cache.getCode().equals(codeEntity.getCode())){
                return true;
            }
        }
        return false;
    }

    @Override
    public String policy() {
        return CodePersistencePolicy.REDIS.getPolicy();
    }

    private void ttlTask(CodeEntity codeEntity){
        ttlTimer.newTimeout(new TimerTask() {
            @Override
            public void run(Timeout timeout) throws Exception {
                String key =JedisKeyUtil.getSMSCodeKey(codeEntity);
                String value = JEDIS_CLIENT.get(key);
                if (!StringUtils.isEmpty(value)){
                    JEDIS_CLIENT.del(key);
                }
            }
        }, codeEntity.getTtl().longValue()+10000, TimeUnit.MILLISECONDS);
    }
}
