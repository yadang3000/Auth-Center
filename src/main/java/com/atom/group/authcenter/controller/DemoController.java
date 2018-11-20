package com.atom.group.authcenter.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-11-15 12:21
 **/
@RestController
public class DemoController {

    @Value("${txt.abc}")
    private String abc;

    @GetMapping("/demo/test")
    public String test(){
        return abc;
    }

}
