package com.liuxiaonian.client.feign;

import feign.RequestLine;

public interface FeignClient {
    @RequestLine("GET /hello")
    public String sayHello();
}
