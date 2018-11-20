package com.atom.group.authcenter.core.handler.login;

import com.atom.group.authcenter.core.code.enums.CodeType;
import com.atom.group.authcenter.core.context.JedisContextHolder;
import com.atom.group.authcenter.core.exceptions.LoginException;
import com.atom.group.authcenter.core.jedis.JedisClient;
import com.atom.group.authcenter.core.utils.JedisKeyUtil;
import com.atom.group.authcenter.core.validation.impl.MobileExistValidator;
import com.atom.group.authcenter.core.validation.impl.SMSCodeValidator;
import com.atom.group.authcenter.core.validation.VerifyChain;
import com.atom.group.authcenter.entity.User;
import com.atom.group.authcenter.model.Logon;
import org.springframework.util.StringUtils;


/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-10 11:43
 **/
public class MobileLoginHandler extends AbstractLoginHandler {

    private String mobile;

    public MobileLoginHandler(Logon logon) {
        super(logon);
        this.mobile = logon.getIdentity().split("-")[1];
    }

    @Override
    protected User validate() {
        Logon logon = getLogon();

        // 验证手机号码是否已注册
        MobileExistValidator mobileExistValidator = new MobileExistValidator(mobile);
        // 验证验证码是否正确
        SMSCodeValidator smsCodeValidator = new SMSCodeValidator(mobile,logon.getCredentials(),CodeType.Login);

        VerifyChain chain = new VerifyChain();
        chain.put(mobileExistValidator,true);
        chain.put(smsCodeValidator,true);
        Boolean checkPass = chain.executeChain();

        if (!checkPass){
            throw new LoginException("验证不通过，登录失败");
        }

        User user = mobileExistValidator.getUser();
        return user;
    }
}
