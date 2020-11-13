package com.docker.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {

    @Value("${spring.profiles.active}")
    private String env;

    @GetMapping("/hello")
    public String hello(){
        return "hello docker-----"+env;
    }
}
