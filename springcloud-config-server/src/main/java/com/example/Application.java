package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer //启用spring cloud config 服务
@EnableEurekaClient //启用EurekaClient服务
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}