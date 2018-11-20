package com.atom.group.authcenter.core.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-15 15:24
 **/
public class AuthTheadPool{

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthTheadPool.class);

    private int coreSize = Runtime.getRuntime().availableProcessors();

    private ThreadPoolExecutor executor = null;

    private String poolName = "AuthTheadPool";

    public static ThreadPoolExecutor create(String poolName){
        AuthTheadPool authTheadPool = new AuthTheadPool(poolName);
        return authTheadPool.getExecutor();
    }

    public AuthTheadPool(int coreSize, String poolName) {
        this.coreSize = coreSize;
        this.poolName = poolName;
        init();
    }

    public AuthTheadPool(String poolName) {
        this.poolName = poolName;
        init();
    }

    public void init(){
        executor = new ThreadPoolExecutor(
                coreSize,
                coreSize,
                0,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(),
                AuthThreadFactory.create(poolName,false),
                new ThreadPoolExecutor.AbortPolicy()
                );
    }



    public ThreadPoolExecutor getExecutor() {
        return executor;
    }
}
