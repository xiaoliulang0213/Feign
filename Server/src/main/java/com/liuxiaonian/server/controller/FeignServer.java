package com.liuxiaonian.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignServer {
    @RequestMapping("/hello")
    public String printInformation(){
       return "Hello World";
    }
}
