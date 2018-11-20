package com.atom.group.authcenter;

import com.atom.group.authcenter.core.config.AuthBootstrapConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan(basePackages = {
        "com.atom.group.authcenter.dao"
})
@EnableAspectJAutoProxy
public class AuthCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthCenterApplication.class, args);
    }

}
