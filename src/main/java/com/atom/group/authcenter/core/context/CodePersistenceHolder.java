package com.atom.group.authcenter.core.context;

import com.atom.group.authcenter.core.code.persistence.CodePersistence;
import com.atom.group.authcenter.core.code.enums.CodePersistencePolicy;
import com.atom.group.authcenter.core.code.persistence.impl.LocalCodePersistence;
import com.atom.group.authcenter.core.config.AuthBootstrapConfig;

import java.util.Objects;
import java.util.ServiceLoader;
import java.util.stream.StreamSupport;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-15 17:08
 **/
public class CodePersistenceHolder {

    public static void init(AuthBootstrapConfig config){
        CodePersistencePolicy persistencePolicy = CodePersistencePolicy.acquire(config.getCodePersistencePolicy());
        ServiceLoader<CodePersistence> loader = ServiceLoader.load(CodePersistence.class);
        CodePersistence codePersistence = StreamSupport.stream(loader.spliterator(),false)
                .filter(policy->Objects.equals(policy.policy(),persistencePolicy.getPolicy()))
                .findFirst()
                .orElse(new LocalCodePersistence());
        SpringContextHolder.getInstance().registerBean(CodePersistence.class.getName(),codePersistence);
    }


    public static CodePersistence getCodePersistence(){
        return SpringContextHolder.getInstance().getBean(CodePersistence.class);
    }

}
