package com.liuxiaonian.feignconsumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "Provider-Second")
public interface FeignInterface {
    @RequestMapping(value = "/print",method = RequestMethod.GET)
    public String feignInterface();
}
