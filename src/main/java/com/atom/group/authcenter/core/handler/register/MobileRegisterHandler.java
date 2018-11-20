package com.atom.group.authcenter.core.handler.register;

import com.atom.group.authcenter.core.code.enums.CodeType;
import com.atom.group.authcenter.core.validation.impl.MobileExistValidator;
import com.atom.group.authcenter.core.validation.impl.SMSCodeValidator;
import com.atom.group.authcenter.core.validation.VerifyChain;
import com.atom.group.authcenter.model.Register;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-28 17:14
 **/
public class MobileRegisterHandler extends AbstractRegisterHandler {

    public MobileRegisterHandler(Register register) {
        super(register);
    }

    @Override
    protected Boolean verify(){
        // 构造校验链
        Register register = getRegister();

        VerifyChain verifyChain = new VerifyChain();
        verifyChain.put(new SMSCodeValidator(register.getMobile(),register.getCode(),CodeType.Register),true);
        verifyChain.put(new MobileExistValidator(register.getMobile()),false);
        Boolean matched = verifyChain.executeChain();
        return matched;
    }

}
