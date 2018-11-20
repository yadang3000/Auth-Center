package com.atom.group.authcenter.controller;

import com.atom.group.authcenter.model.Logon;
import com.atom.group.authcenter.service.LogoutService;
import com.atom.group.authcenter.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-27 16:29
 **/
@RestController
public class SignInController {

    @Autowired
    private SignInService signInService;

    @Autowired
    private LogoutService logoutService;

    @PostMapping("/signIn")
    public String login(@RequestBody Logon logon){
        return signInService.signIn(logon);
    }


    @PostMapping("/logout")
    public Boolean logout(@RequestParam("jwt")String jwt){
        return logoutService.logoutByToken(jwt);
    }
}
