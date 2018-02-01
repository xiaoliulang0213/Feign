package com.liuxiaonian.providerfirst.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/print",method = RequestMethod.GET)
    public String printHello(){
        return "I am Provider-Second!";
    }
}
