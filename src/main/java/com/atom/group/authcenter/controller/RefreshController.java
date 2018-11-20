package com.atom.group.authcenter.controller;

import com.atom.group.authcenter.service.RefreshService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.locks.LockSupport;

/**
 * @program: auth-center
 * @description:
 * @author: Maxxx.Yg
 * @create: 2018-09-27 17:33
 **/
@RestController
@Slf4j
public class RefreshController {

    @Autowired
    private RefreshService refreshService;

    @PostMapping("/refresh")
    public String refresh(@RequestParam("jwt") String jwt){
        return refreshService.refresh(jwt);
    }


    @GetMapping("test")
    public boolean test(){
        Thread t = new Thread(()->{
            int it = 0;
           while (true){
               log.info("test:"+it++);
               LockSupport.parkNanos(1000*1000);
           }
        });
        t.start();
        return true;
    }
}
