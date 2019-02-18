package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@EnableEurekaClient //启用EurekaClient服务
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    private static final Logger LOG = Logger.getLogger(Application.class.getName());


    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String hi(String name) {
        LOG.log(Level.INFO, "info is being called");
        return String.format("hello %s , from port=%s", name, port);
    }


    @RequestMapping("/hello/hi")
    public String hello(String name) {
        return String.format("hello %s , from port=%s", name, port);
    }


}