package com.atom.group.authcenter.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-15 17:03
 **/
@Component
@ConfigurationProperties(prefix = "auth")
//@PropertySource("classpath:authBootstrapConfig.yml")
public class AuthBootstrapConfig {

    /**
     * 验证码持久化策略
     */
    private String codePersistencePolicy;

    public String getCodePersistencePolicy() {
        return codePersistencePolicy;
    }

    public void setCodePersistencePolicy(String codePersistencePolicy) {
        this.codePersistencePolicy = codePersistencePolicy;
    }
}
