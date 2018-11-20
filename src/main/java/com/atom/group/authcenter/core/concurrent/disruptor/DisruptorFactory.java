package com.atom.group.authcenter.core.concurrent.disruptor;


import com.atom.group.authcenter.core.concurrent.AuthThreadFactory;
import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.IgnoreExceptionHandler;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;



/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 11:59
 **/
public class DisruptorFactory {

    public static  <T> Disruptor<T> newInstance(EventFactory<T> eventFactory){
        Disruptor<T> disruptor = new Disruptor<>(
                eventFactory,
                4096<<4,
                new AuthThreadFactory("disruptor-thread-",false),
                ProducerType.MULTI,
                new BlockingWaitStrategy()
        );

        disruptor.setDefaultExceptionHandler(new IgnoreExceptionHandler());

        return disruptor;
    }


}
