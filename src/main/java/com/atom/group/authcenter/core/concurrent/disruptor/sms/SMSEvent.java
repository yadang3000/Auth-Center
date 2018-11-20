package com.atom.group.authcenter.core.concurrent.disruptor.sms;

import com.atom.group.authcenter.core.code.CodeEntity;

import java.io.Serializable;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-18 10:43
 **/
public class SMSEvent implements Serializable {

    private CodeEntity codeEntity;

    public CodeEntity getCodeEntity() {
        return codeEntity;
    }

    public void setCodeEntity(CodeEntity codeEntity) {
        this.codeEntity = codeEntity;
    }
}
