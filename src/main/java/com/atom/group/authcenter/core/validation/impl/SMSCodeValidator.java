package com.atom.group.authcenter.core.validation.impl;

import com.atom.group.authcenter.core.code.CodeEntity;
import com.atom.group.authcenter.core.code.persistence.CodePersistence;
import com.atom.group.authcenter.core.code.enums.CodeType;
import com.atom.group.authcenter.core.context.CodePersistenceHolder;
import com.atom.group.authcenter.core.utils.GsonUtils;
import com.atom.group.authcenter.core.validation.BaseValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-29 16:00
 **/
public class SMSCodeValidator implements BaseValidator {

    private final static Logger logger = LoggerFactory.getLogger(SMSCodeValidator.class);

    private String mobile;

    private String code;

    private CodeType codeType;

    public SMSCodeValidator(String mobile, String code, CodeType codeType) {
        this.mobile = mobile;
        this.code = code;
        this.codeType = codeType;
    }

    @Override
    public Boolean check() {

        CodePersistence codePersistence = CodePersistenceHolder.getCodePersistence();

        CodeEntity entity = new CodeEntity();
        entity.setCode(code);
        entity.setCodeType(codeType);
        entity.setId(mobile);

        Boolean res = codePersistence.match(entity);
        if (!res){
            logger.warn("手机号：{},验证码:{},{} 过期或不匹配",mobile,code,codeType.getCodeDescription());
        }

        return res;
    }
}
