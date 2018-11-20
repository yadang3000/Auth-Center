package com.atom.group.authcenter.controller;

import com.atom.group.authcenter.core.code.enums.CodeType;
import com.atom.group.authcenter.core.handler.authentication.UserAuthenticationHandler;
import com.atom.group.authcenter.entity.User;
import com.atom.group.authcenter.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-27 16:33
 **/
@RestController
public class UserController {

    @Autowired
    private CodeService codeService;


    @GetMapping("/loginCode")
    public Boolean loginCode(@RequestParam("mobile") String mobile){
        return codeService.sendCodeByPhone(mobile,CodeType.Login);
    }

    @GetMapping("/registerCode")
    public Boolean registerCode(@RequestParam("mobile") String mobile){
        return codeService.sendCodeByPhone(mobile,CodeType.Register);
    }

    @PostMapping("/onlineUser")
    public User checkLoginUser(@RequestParam("jwt") String jwt){
        return UserAuthenticationHandler.onlineUser(jwt);
    }

}
