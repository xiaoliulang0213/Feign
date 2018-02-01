package com.liuxiaonian.feignconsumer.controller;

import com.liuxiaonian.feignconsumer.feign.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/server")
public class ConsumerController {
    @Resource
    private FeignInterface feignInterface;
    @RequestMapping(value = "/consumer",method = RequestMethod.GET)
    public String consumer(){
        return feignInterface.feignInterface();
    }
}
