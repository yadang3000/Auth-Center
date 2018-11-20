package com.atom.group.authcenter.core.context;

import com.atom.group.authcenter.dao.*;
import org.springframework.context.ApplicationContext;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-28 11:08
 **/
public class DaoContextHolder {

    private ApplicationContext applicationContext;

    private UserMapper userMapper;

    private UserTokenMapper userTokenMapper;

    private UserValidateCodeMapper userValidateCodeMapper;

    private ApplicationClientMapper applicationClientMapper;

    private ApplicationMapper applicationMapper;

    private ApplicationUserMapper applicationUserMapper;

    private ThirdSystemMapper thirdSystemMapper;

    private ThirdUserMapper thirdUserMapper;

    private static DaoContextHolder INSTANCE = new DaoContextHolder();

    public static DaoContextHolder getInstance(){
        if (INSTANCE==null){
            synchronized (DaoContextHolder.class){
                if (INSTANCE==null){
                    INSTANCE = new DaoContextHolder();
                }
            }
        }
        return INSTANCE;
    }


    private DaoContextHolder(){

    }

    public static void init(ApplicationContext applicationContext) {
        INSTANCE.applicationContext = applicationContext;
        INSTANCE.userMapper = applicationContext.getBean(UserMapper.class);
        INSTANCE.userTokenMapper = applicationContext.getBean(UserTokenMapper.class);
        INSTANCE.userValidateCodeMapper = applicationContext.getBean(UserValidateCodeMapper.class);
        INSTANCE.applicationClientMapper = applicationContext.getBean(ApplicationClientMapper.class);
        INSTANCE.applicationMapper = applicationContext.getBean(ApplicationMapper.class);
        INSTANCE.applicationUserMapper = applicationContext.getBean(ApplicationUserMapper.class);
        INSTANCE.thirdSystemMapper = applicationContext.getBean(ThirdSystemMapper.class);
        INSTANCE.thirdUserMapper = applicationContext.getBean(ThirdUserMapper.class);
    }


    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static UserMapper getUserMapper() {
        return INSTANCE.userMapper;
    }

    public static UserTokenMapper getUserTokenMapper() {
        return INSTANCE.userTokenMapper;
    }

    public static UserValidateCodeMapper getUserValidateCodeMapper() {
        return INSTANCE.userValidateCodeMapper;
    }

    public static ApplicationClientMapper getApplicationClientMapper() {
        return INSTANCE.applicationClientMapper;
    }

    public static ApplicationMapper getApplicationMapper() {
        return INSTANCE.applicationMapper;
    }

    public static ApplicationUserMapper getApplicationUserMapper() {
        return INSTANCE.applicationUserMapper;
    }

    public static ThirdSystemMapper getThirdSystemMapper() {
        return INSTANCE.thirdSystemMapper;
    }

    public static ThirdUserMapper getThirdUserMapper() {
        return INSTANCE.thirdUserMapper;
    }
}
