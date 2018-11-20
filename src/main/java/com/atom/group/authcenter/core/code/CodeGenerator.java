package com.atom.group.authcenter.core.code;

import org.springframework.util.StringUtils;

import java.util.concurrent.locks.LockSupport;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-28 18:02
 **/
public class CodeGenerator {

    public static String build(){

        long stamp = System.currentTimeMillis();

        // 取6位
        long baseCode = stamp % 1000000;
        StringBuilder sb = new StringBuilder();
        String code = String.valueOf(baseCode);
        sb.append(code);
        int codeLength = code.length();

        // 长度填充
        for(int i = 0;i<6-codeLength;i++){
            sb.append(i);
        }

        return sb.toString();
    }


    public static void main(String args[]){

        for(int i = 0;i<10;i++){

            System.out.println(build());

        }

    }

}
