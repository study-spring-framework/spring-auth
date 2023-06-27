package com.sparta.springauth.aop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AopController {
    @GetMapping("/aop")
    public String hello(){
        return "Hello, World!";
    }
}
