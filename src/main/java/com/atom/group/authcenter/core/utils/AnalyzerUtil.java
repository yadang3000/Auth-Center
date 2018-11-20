package com.atom.group.authcenter.core.utils;

import io.jsonwebtoken.JwsHeader;
import org.springframework.util.StringUtils;

import java.util.HashMap;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-10 11:37
 **/
public final class AnalyzerUtil {

    private AnalyzerUtil(){

    }

    public static Boolean isMobile(String str){
        try {
            if (str.length()>4){
                if (str.contains("-")){
                    if (str.startsWith("86")&&str.length()!=14){
                        return false;
                    }
                    str = str.split("-")[1];
                }else{
                    return false;
                }
                Long.parseLong(str);
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }

    public static Boolean isEmail(String str){
        if (
                str.length()>5
                        &&str.contains("@")
                        &&str.contains(".")
                ){
            if (str.startsWith("@")||str.endsWith("@")){
                return false;
            }
            if (str.startsWith(".")||str.endsWith(".")){
                return false;
            }
            if (str.indexOf(".")<str.indexOf("@")){
                return false;
            }
            return true;
        }
        return false;
    }

    public static Boolean isUserName(String str){
        if (str.length()<6){
            return false;
        }

        char[] chars = str.toCharArray();
        HashMap<Integer,Integer> A_Z = new HashMap<>();
        HashMap<Integer,Integer> a_z = new HashMap<>();

        for(int index = 0;index<chars.length;index++){
            int ansi_dec = (int)chars[index];
            if (ansi_dec>=48 && ansi_dec<=57)
            {
                continue;
            }else if(ansi_dec>=65&&ansi_dec<=90){
                A_Z.put(ansi_dec,1);
            }else if(ansi_dec>=97&&ansi_dec<=122){
                a_z.put(ansi_dec,1);
            }else{
                return false;
            }
        }

        if (a_z.keySet().size()==0&&A_Z.keySet().size()==0){
            return false;
        }
        return true;
    }

    public static Boolean isJwt(String str){
        if (StringUtils.isEmpty(str)){
            return false;
        }
        try{
            JwsHeader header = JwtUtil.getHeader(str);
            if (header==null){
                return false;
            }
            if (header.getType().equals("JWT")){
                return true;
            }
        }catch (Exception e){
            return false;
        }
        return false;
    }

    public static void main(String[] args){
        isUserName("1aAggg");
    }
}
