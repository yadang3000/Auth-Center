package com.atom.group.authcenter.core.concurrent.disruptor.sms;

import com.atom.group.authcenter.core.code.CodeSendService;
import com.lmax.disruptor.WorkHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 10:45
 **/
public class SMSEventHandler implements WorkHandler<SMSEvent> {

    private final static Logger logger = LoggerFactory.getLogger(SMSEventHandler.class);

    private ThreadPoolExecutor executor;

    private CodeSendService codeSendService;

    public SMSEventHandler(ThreadPoolExecutor executor, CodeSendService codeSendService) {
        this.executor = executor;
        this.codeSendService = codeSendService;
    }

    @Override
    public void onEvent(SMSEvent event) throws Exception {
        executor.execute(()->{
            try{
                codeSendService.sendCode(event.getCodeEntity());
            }catch (Exception e){
                logger.error("短信发送异常",e);
            }
        });
    }

}
