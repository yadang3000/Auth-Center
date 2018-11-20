package com.atom.group.authcenter.core.concurrent;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-15 15:47
 **/
public class AuthThreadFactory implements ThreadFactory {

    private static final AtomicLong THREAD_NUMBER = new AtomicLong(1);

    private static final ThreadGroup THREAD_GROUP = new ThreadGroup("Auth-Center");

    private final String namePrefix;

    private boolean daemon;

    public AuthThreadFactory(String namePrefix, boolean daemon) {
        this.namePrefix = namePrefix;
        this.daemon = daemon;
    }

    public static ThreadFactory create(String namePrefix, Boolean daemon){
        return new AuthThreadFactory(namePrefix,daemon);
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(
                THREAD_GROUP,
                r,
                THREAD_GROUP.getName()+"-"+namePrefix+"-"+THREAD_NUMBER.getAndIncrement()
        );
        thread.setDaemon(daemon);
        thread.setPriority(Thread.NORM_PRIORITY);
        return thread;
    }

}
