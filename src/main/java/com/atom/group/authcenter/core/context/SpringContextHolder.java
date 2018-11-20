package com.atom.group.authcenter.core.context;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.Assert;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-10 12:09
 **/
public final class SpringContextHolder {

    private SpringContextHolder() {

    }

    private static final SpringContextHolder INSTANCE = new SpringContextHolder();

    private ConfigurableApplicationContext context;

    public ConfigurableApplicationContext getContext() {
        return context;
    }

    public static void init(ConfigurableApplicationContext context){
        INSTANCE.context = context;
    }

    public static SpringContextHolder getInstance() {
        return INSTANCE;
    }

    public <T> T getBean(final Class<T> type) {
        Assert.notNull(type,"type can't null");
        return context.getBean(type);
    }

    public void registerBean(final String beanName, final Object obj) {
        Assert.notNull(beanName,"beanName can't null");
        Assert.notNull(obj,"obj can't null");
        context.getBeanFactory().registerSingleton(beanName, obj);
    }

}
