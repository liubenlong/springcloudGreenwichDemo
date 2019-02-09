package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "springcloud-eureka-serviceprovider")
public interface HelloService {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);
}