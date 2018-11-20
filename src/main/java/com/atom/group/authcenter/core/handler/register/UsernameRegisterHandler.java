package com.atom.group.authcenter.core.handler.register;

import com.atom.group.authcenter.core.utils.PasswordUtil;
import com.atom.group.authcenter.core.validation.VerifyChain;
import com.atom.group.authcenter.core.validation.impl.PasswordFormatValidator;
import com.atom.group.authcenter.core.validation.impl.UsernameExsitValidator;
import com.atom.group.authcenter.core.validation.impl.UsernameFormatValidator;
import com.atom.group.authcenter.model.Register;
import org.springframework.util.DigestUtils;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-28 17:14
 **/
public class UsernameRegisterHandler extends AbstractRegisterHandler {



    public UsernameRegisterHandler(Register register) {
        super(register);
    }

    @Override
    protected Boolean verify() {

        Register register = getRegister();
        VerifyChain verifyChain = new VerifyChain();
        // 用户名合规校验
        verifyChain.put(new UsernameFormatValidator(register.getUserName()),true);
        // 用户名重复校验
        verifyChain.put(new UsernameExsitValidator(register.getUserName()),false);
        // md5密码校验
        verifyChain.put(new PasswordFormatValidator(register.getPassword()),true);
        Boolean isPass = verifyChain.executeChain();

        if(isPass){
            register.setPassword(PasswordUtil.encipher(register.getPassword()));
        }

        return isPass;
    }




}
