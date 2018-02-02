package com.liuxiaonian.client.feign;

import com.liuxiaonian.client.domain.Person;
import feign.Headers;
import feign.RequestLine;

public interface FeignClient {
    @RequestLine("GET /hello")
    public String sayHello();

    @RequestLine("POST /print")
    @Headers("Content-Type: application/json")
    public String printPerson(Person person);
}
