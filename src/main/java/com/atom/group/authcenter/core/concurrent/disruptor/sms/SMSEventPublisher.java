package com.atom.group.authcenter.core.concurrent.disruptor.sms;

import com.atom.group.authcenter.core.code.CodeEntity;
import com.atom.group.authcenter.core.code.CodeSendService;
import com.atom.group.authcenter.core.concurrent.AuthTheadPool;
import com.atom.group.authcenter.core.concurrent.disruptor.DisruptorFactory;
import com.atom.group.authcenter.core.concurrent.disruptor.EventPublisher;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 11:55
 **/
@Service
public class SMSEventPublisher implements EventPublisher<CodeEntity>,InitializingBean,DisposableBean {

    private Disruptor<SMSEvent> disruptor;

    private ThreadPoolExecutor executor;

    @Autowired
    private CodeSendService codeSendService;


    @Override
    public void publishEvent(CodeEntity codeEntity) {
        RingBuffer<SMSEvent> ringBuffer = disruptor.getRingBuffer();
        ringBuffer.publishEvent(new SMSEventTranslator(),codeEntity);
    }


    @Override
    public void destroy() throws Exception {
        disruptor.shutdown();
        executor.shutdown();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        disruptor = DisruptorFactory.newInstance(new SMSEventFactory());
        executor = AuthTheadPool.create("distruptor-sms-");

        SMSEventHandler[] consumers = new SMSEventHandler[Runtime.getRuntime().availableProcessors()];
        for(int i = 0;i<Runtime.getRuntime().availableProcessors();i++){
            consumers[i] = new SMSEventHandler(executor,codeSendService);
        }
        disruptor.handleEventsWithWorkerPool(consumers);

        disruptor.start();
    }


}
