package com.atom.group.authcenter.core.concurrent.disruptor.sms;

import com.lmax.disruptor.EventFactory;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 10:44
 **/
public class SMSEventFactory implements EventFactory<SMSEvent> {

    @Override
    public SMSEvent newInstance() {
        return new SMSEvent();
    }
}
