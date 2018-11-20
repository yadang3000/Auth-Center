package com.atom.group.authcenter.service.impl;

import com.atom.group.authcenter.core.code.CodeEntity;
import com.atom.group.authcenter.core.code.CodeGenerator;
import com.atom.group.authcenter.core.code.enums.CodeType;
import com.atom.group.authcenter.core.code.CodeSendService;
import com.atom.group.authcenter.core.concurrent.disruptor.sms.SMSEventPublisher;
import com.atom.group.authcenter.core.exceptions.CheckException;
import com.atom.group.authcenter.core.exceptions.ExceptionCode;
import com.atom.group.authcenter.core.utils.AnalyzerUtil;
import com.atom.group.authcenter.service.CodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-29 10:58
 **/
@Service
@Slf4j
public class CodeServiceImpl implements CodeService {

    @Autowired
    private SMSEventPublisher smsEventPublisher;

    @Override
    public Boolean sendCodeByPhone(String phone, CodeType codeType) {

        if (!AnalyzerUtil.isMobile(phone)){
            throw new CheckException(ExceptionCode.MOBILE_ERROR);
        }

        String code = CodeGenerator.build();

        CodeEntity codeEntity = new CodeEntity();
        codeEntity.setId(phone);
        codeEntity.setCodeType(codeType);
        codeEntity.setCode(code);
        codeEntity.setTtl(1000*60*10L);

        smsEventPublisher.publishEvent(codeEntity);

        log.info("短信验证码：" + phone + "  code：" +code);

        return true;
    }

    @Override
    public Boolean sendCodeByEmail(String email) {

        return null;
    }
}
