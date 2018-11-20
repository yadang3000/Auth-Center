package com.atom.group.authcenter.controller;

import com.atom.group.authcenter.model.Register;
import com.atom.group.authcenter.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-27 16:30
 **/
@RestController
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @PostMapping("/signUp")
    public Object register(@RequestBody Register register){
        return signUpService.signUp(register);
    }

}
