package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("a")
    public Mono<String> a() {
        System.out.println("aaaaaaaa");
        return Mono.just("aa");
    }
    @RequestMapping("b")
    public Mono<String> b() {
        System.out.println(System.currentTimeMillis() + "bbbbb");
        return Mono.just("bb");
    }
}
