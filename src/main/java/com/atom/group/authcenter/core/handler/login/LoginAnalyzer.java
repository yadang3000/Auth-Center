package com.atom.group.authcenter.core.handler.login;

import com.atom.group.authcenter.core.exceptions.LoginException;
import com.atom.group.authcenter.core.utils.AnalyzerUtil;
import com.atom.group.authcenter.model.Logon;
import org.springframework.util.StringUtils;


/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-30 10:38
 **/
public class LoginAnalyzer {

    public static AbstractLoginHandler analyze(Logon logon) throws LoginException{

        if (logon==null){
            throw new LoginException("登录失败，无效的内容");
        }
        if (StringUtils.isEmpty(logon.getAudience())){
            throw new LoginException("Audience 接受端不明");
        }
        if (StringUtils.isEmpty(logon.getSubject())){
            throw new LoginException("Subject 仅限 web、app、pc、iot");
        }
        if (StringUtils.isEmpty(logon.getIdentity())||StringUtils.isEmpty(logon.getCredentials())){
            throw new LoginException("登录失败，凭证缺失");
        }

        // 根据身份类型判断使用哪一种登录处理器
        AbstractLoginHandler handler = null;

        // 分析注册类型
        if (AnalyzerUtil.isMobile(logon.getIdentity())){
            handler = new MobileLoginHandler(logon);
        }else if(AnalyzerUtil.isUserName(logon.getIdentity())){
            handler = new UsernameLoginHandler(logon);
        }else if(AnalyzerUtil.isEmail(logon.getIdentity())){
            handler = new EmailLoginHandler(logon);
        }else if(AnalyzerUtil.isJwt(logon.getCredentials())){
            handler = new JwtLoginHandler(logon);
        } else {
            throw new LoginException("登录失败，无效的凭证");
        }

        return handler;
    }



}
