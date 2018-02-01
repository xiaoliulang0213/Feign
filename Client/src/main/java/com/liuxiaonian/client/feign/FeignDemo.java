package com.liuxiaonian.client.feign;

import feign.Feign;
import feign.gson.GsonEncoder;

public class FeignDemo {
    public static void main(String[] args){
        //创建Feign客户端实例
        FeignClient feignClient = Feign.builder()
                .encoder(new GsonEncoder())
                .target(FeignClient.class,"http://localhost:8080/");
        //发送请求
        feignClient.sayHello();
    }
}
