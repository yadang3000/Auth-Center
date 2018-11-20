package com.atom.group.authcenter.core.handler.register;

import com.atom.group.authcenter.core.exceptions.RegisterException;
import com.atom.group.authcenter.core.utils.AnalyzerUtil;
import com.atom.group.authcenter.model.Register;
import org.springframework.util.StringUtils;

/**
 * @program: auth-center
 * @description: 注册分析器
 * @author: Maxxx.Yg
 * @create: 2018-09-28 17:12
 **/
public class RegisterAnalyzer {


    public static AbstractRegisterHandler analyze(Register register) throws RegisterException {
        if (register==null){
            throw new RegisterException("无效的注册内容");
        }

        if (StringUtils.isEmpty(register.getOrigin())){
            throw new RegisterException("账号来源 origin 缺失");
        }

        AbstractRegisterHandler handler = null;
        // 分析注册类型
        if (!StringUtils.isEmpty(register.getMobile())&&!StringUtils.isEmpty(register.getCode())){
            if (AnalyzerUtil.isMobile(register.getMobile())) {
                handler = new MobileRegisterHandler(register);
            }else {
                throw new RegisterException("手机号格式错误");
            }
        }else if(!StringUtils.isEmpty(register.getUserName())&&!StringUtils.isEmpty(register.getPassword())){
            if(AnalyzerUtil.isUserName(register.getUserName())){
                handler = new UsernameRegisterHandler(register);
            }else{
                throw new RegisterException("用户名仅限英文字母大小写以及阿拉伯数字");
            }
        }else if(!StringUtils.isEmpty(register.getEmail())&&!StringUtils.isEmpty(register.getPassword())){
            if (AnalyzerUtil.isEmail(register.getEmail())){
                handler = new EmailRegisterHandler(register);
            }else{
                throw new RegisterException("无效的Email");
            }
        }else{
            throw new RegisterException("无效的注册方式");
        }
        return handler;
    }

}
