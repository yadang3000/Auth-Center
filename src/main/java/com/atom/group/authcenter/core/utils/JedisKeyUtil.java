package com.atom.group.authcenter.core.utils;

import com.atom.group.authcenter.core.code.CodeEntity;
import com.atom.group.authcenter.entity.User;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-16 13:55
 **/
public class JedisKeyUtil {

    private static final String AUTH_USER = "auth-user:";

    private static final String USER_INFO = "user-info:";

    private static final String SMS_CODE = "sms-code:";

    public static String getAuthUserKey(User user, String audience, String subject){
        return AUTH_USER+audience+":"+subject+":"+String.valueOf(user.getUserId());
    }

    public static String getAuthUserKey(String userId, String audience, String subject){
        return AUTH_USER+audience+":"+subject+":"+String.valueOf(userId);
    }

    public static String getUserInfoKey(String userId)
    {
        return USER_INFO+userId;
    }

    public static String getSMSCodeKey(CodeEntity codeEntity){
        return SMS_CODE+codeEntity.getCodeType().getCodeType()+":"+codeEntity.getId();
    }
}
