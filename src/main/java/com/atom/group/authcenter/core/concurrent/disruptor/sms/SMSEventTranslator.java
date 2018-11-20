package com.atom.group.authcenter.core.concurrent.disruptor.sms;

import com.atom.group.authcenter.core.code.CodeEntity;
import com.lmax.disruptor.EventTranslatorOneArg;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 11:53
 **/
public class SMSEventTranslator implements EventTranslatorOneArg<SMSEvent,CodeEntity> {

    @Override
    public void translateTo(SMSEvent event, long sequence, CodeEntity arg0) {
        event.setCodeEntity(arg0);
    }
}
