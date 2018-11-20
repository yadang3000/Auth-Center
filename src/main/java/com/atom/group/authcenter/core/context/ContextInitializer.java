package com.atom.group.authcenter.core.context;

import com.atom.group.authcenter.core.config.AuthBootstrapConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;


/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-28 11:57
 **/
@Component
@Slf4j
public class ContextInitializer implements InitializingBean,ApplicationContextAware {

    private ConfigurableApplicationContext context;

    @Autowired
    private AuthBootstrapConfig config;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("============= Context init starting =============");
        DaoContextHolder.init(context);
        SpringContextHolder.init(context);
        CodePersistenceHolder.init(config);
        log.info("============= Context init success =============");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = (ConfigurableApplicationContext)applicationContext;
    }
}
