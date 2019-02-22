package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //启用EurekaClient组件
@EnableFeignClients  //开启Feign的功能
//@EnableHystrix // 这个测试无效，需要在配置文件中指定feign.hystrix.enabled=true
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}