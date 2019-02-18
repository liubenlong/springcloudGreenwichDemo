package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class HelloController {
    private static final Logger LOG = Logger.getLogger(HelloController.class.getName());

    @Autowired
    HelloService helloService;

    @RequestMapping("/")
    public String hi(String name) {
        LOG.log(Level.INFO, "calling trace service-hi  ");
        //这里直接写的是服务名： springcloud-eureka-serviceprovider  。在ribbon中它会根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的url替换掉服务名
        return helloService.hi(name);
    }
}
