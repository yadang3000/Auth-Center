package com.atom.group.authcenter.core.utils;

import com.atom.group.authcenter.core.code.CodeEntity;
import com.atom.group.authcenter.core.code.persistence.CodePersistence;
import com.atom.group.authcenter.core.context.CodePersistenceHolder;
import com.google.common.base.Splitter;
import org.springframework.util.StringUtils;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-28 18:00
 **/
public class SMSUtil {

    public static String convertMobileNumber(String mobile){
        if (StringUtils.isEmpty(mobile)){
            return null;
        }
        if (mobile.startsWith("86-")){
            return Splitter.on("-").splitToList(mobile).get(1);
        }else if(mobile.contains("-")){
            return "00"+mobile.replace("-","");
        }else if(mobile.startsWith("00")){
            return mobile;
        }else{
            return null;
        }
    }
}
