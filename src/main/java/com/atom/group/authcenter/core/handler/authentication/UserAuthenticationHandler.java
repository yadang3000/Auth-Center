package com.atom.group.authcenter.core.handler.authentication;

import com.atom.group.authcenter.core.constans.AuthHeaderConstant;
import com.atom.group.authcenter.core.context.JedisContextHolder;
import com.atom.group.authcenter.core.context.SpringContextHolder;
import com.atom.group.authcenter.core.exceptions.CheckException;
import com.atom.group.authcenter.core.exceptions.ExceptionCode;
import com.atom.group.authcenter.core.utils.JedisKeyUtil;
import com.atom.group.authcenter.core.utils.JwtUtil;
import com.atom.group.authcenter.entity.User;
import com.atom.group.authcenter.service.UserSerivce;
import io.jsonwebtoken.Claims;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-10-17 14:27
 **/
public class UserAuthenticationHandler {

    public static User onlineUser(String jwt){
        String id = getUserId(jwt);
        User user = SpringContextHolder.getInstance().getBean(UserSerivce.class).getUser(Long.parseLong(id));
        return user;
    }


    public static String getUserId(String jwt){
        RequestAttributes requestAttributes = null;
        requestAttributes = RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes) requestAttributes).getRequest();

        Assert.notNull(request,"无效的请求");

        String header_audience = null;
        String header_subject = null;
        header_subject = request.getHeader(AuthHeaderConstant.SUBJECT);
        header_audience = request.getHeader(AuthHeaderConstant.AUDIENCE);

        Assert.notNull(header_audience,"audience缺失，请标注请求系统");
        Assert.notNull(header_subject,"subject缺失，请注明作用域（web、app、pc、iot）");

        Claims claims = JwtUtil.getClaims(jwt);
        String id = claims.getId();
        String subject = claims.getSubject();
        String audience = claims.getAudience();
        Date expiration = claims.getExpiration();

        // 校验 subject 与 audience 是否一致
        if(!header_audience.equals(audience)){
            throw new CheckException(ExceptionCode.AUDIENCE_DIFF);
        }
        if(!header_subject.equals(subject)){
            throw new CheckException(ExceptionCode.SUBJECT_DIFF);
        }

        // 是否过期
        if(expiration.getTime()<System.currentTimeMillis()){
            throw new CheckException(ExceptionCode.LOGIN_EXPIEE);
        }

        // 缓存
        String cacheJwt = JedisContextHolder.getJedisClient().get(JedisKeyUtil.getAuthUserKey(id,audience,subject));
        if (StringUtils.isEmpty(cacheJwt)){
            throw new CheckException(ExceptionCode.LOGIN_CACHE_EXPIEE);
        }

        if (!cacheJwt.equals(jwt)){
            throw new CheckException(ExceptionCode.LOGIN_EXPIEE);
        }

        return id;
    }
}
