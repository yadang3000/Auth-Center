package com.atom.group.authcenter.core.handler.login;

import com.atom.group.authcenter.core.code.enums.CodeType;
import com.atom.group.authcenter.core.context.JedisContextHolder;
import com.atom.group.authcenter.core.exceptions.LoginException;
import com.atom.group.authcenter.core.jedis.JedisClient;
import com.atom.group.authcenter.core.utils.JedisKeyUtil;
import com.atom.group.authcenter.core.validation.VerifyChain;
import com.atom.group.authcenter.core.validation.impl.*;
import com.atom.group.authcenter.entity.User;
import com.atom.group.authcenter.model.Logon;
import org.springframework.util.StringUtils;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-10 11:42
 **/
public class UsernameLoginHandler extends AbstractLoginHandler{


    public UsernameLoginHandler(Logon logon) {
        super(logon);
    }

    @Override
    protected User validate() {
        Logon logon = getLogon();

        // 用户是否存在
        UsernameExsitValidator usernameExsitValidator = new UsernameExsitValidator(logon.getIdentity());

        // 密码格式校验
        PasswordFormatValidator passwordFormatValidator = new PasswordFormatValidator(logon.getCredentials());

        // 密码匹配校验
        PasswordValidator passwordValidator = new PasswordValidator(logon.getCredentials(),usernameExsitValidator.getDBUser().getPassword());


        VerifyChain chain = new VerifyChain();
        chain.put(usernameExsitValidator,true);
        chain.put(passwordFormatValidator,true);
        chain.put(passwordValidator,true);
        Boolean checkPass = chain.executeChain();

        if (!checkPass){
            throw new LoginException("验证不通过，登录失败");
        }

        User user = usernameExsitValidator.getUser();

        return user;
    }
}
