package com.atom.group.authcenter.core.utils;

import io.jsonwebtoken.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: MaxxxYg
 * @Date: 2018/9/13 下午3:39
 */
public class JwtUtil {

    private static final String KEY = "auth-center";

    public static void main(String[] args) throws Exception {
        String ab = createJWT("jwt", "Maxxx.Yg", "web",1000 * 60 * 60 * 24 * 7);
        System.out.println(ab);

        Claims c = getClaims(ab);//注意：如果jwt已经过期了，这里会抛出jwt过期异常。
        System.out.println(c.getId());//jwt
        System.out.println(c.getIssuedAt());//Mon Feb 05 20:50:49 CST 2018
        System.out.println(c.getSubject());//{id:100,name:xiaohong}
        System.out.println(c.getIssuer());//null
        System.out.println(c.get("uid", String.class));
        System.out.println("---------------------");
        JwsHeader jwsHeader = getHeader(ab);
        System.out.println(jwsHeader.getType());
        System.out.println(jwsHeader.getAlgorithm());


        Integer a  = 1;
        boolean res = a.equals(1);

    }


    /**
     *
     * @param userId 用户id
     * @param audience 发起请求的系统
     * @param subject 面向类型 web、app、pc、iot
     * @param claims 私有表单
     * @param ttlMillis 过期时长
     * @return jwt加密字符串
     * @throws Exception
     */
    public static String createJWT(String userId,String audience, String subject,Map<String, Object> claims,long ttlMillis) throws Exception {
        if (org.springframework.util.StringUtils.isEmpty(userId)){
            throw new IllegalArgumentException("userId can't null or empty");
        }
        if (org.springframework.util.StringUtils.isEmpty(audience)){
            throw new IllegalArgumentException("audience can't null or empty");
        }
        if (org.springframework.util.StringUtils.isEmpty(subject)){
            throw new IllegalArgumentException("subject can't null or empty");
        }

        long curTime = System.currentTimeMillis();
        Map<String, Object> header = new HashMap<>();
        header.put("typ", "JWT");
        header.put("alg", "HS256");

        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        JwtBuilder jwtBuilder = Jwts.builder()
                .setHeader(header)
                .setIssuer("auth-center")
                .setIssuedAt(new Date(curTime))
                .setAudience(audience)
                .setSubject(subject)
                .signWith(signatureAlgorithm, KEY);

        if (claims!=null){
            jwtBuilder.setClaims(claims);
        }
        if (ttlMillis>0){
            jwtBuilder.setExpiration(new Date(curTime + ttlMillis));
        }
        jwtBuilder.setId(userId);
        return jwtBuilder.compact();
    }

    public static String createJWT(String userId,String audience, String subject,long ttlMillis) throws Exception {
        return createJWT(userId,audience,subject,null,ttlMillis);
    }

    public static String createJWT(String userId,String audience, String subject) throws Exception {
        return createJWT(userId,audience,subject,null,0);
    }

    /**
     * 解密jwt
     *
     * @param jwtString jwt加密字符串
     * @return
     * @throws Exception
     */
    public static Claims getClaims(String jwtString){
        Claims claims = Jwts.parser()
                .setSigningKey(KEY)
                .parseClaimsJws(jwtString).getBody();
        return claims;
    }

    public static Object getBaseClaims(String jwtString){
        Object claims = Jwts.parser()
                .setSigningKey(KEY)
                .parse(jwtString)
                .getBody();
        return claims;
    }

    public static JwsHeader getHeader(String jwtString){
        JwsHeader header = Jwts.parser()
                .setSigningKey(KEY)
                .parseClaimsJws(jwtString).getHeader();
        return header;
    }

}
