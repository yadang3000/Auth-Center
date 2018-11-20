package com.atom.group.authcenter.core.concurrent.disruptor;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 11:56
 **/
@FunctionalInterface
public interface EventPublisher<T> {

    /**
     * 事件发布
     * @param event
     */
    void publishEvent(T event);
}
