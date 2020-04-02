package cn.wthmox.gateway;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import feign.Feign;



@Service
@RestController
public class HelloWorld {

    @GetMapping("/simple/say")
    public String hello(){
        SayHelloWorld sayHelloWorld = Feign.builder().target(SayHelloWorld.class, "http://127.0.0.1:8081");
        return sayHelloWorld.hello() +"11";
    }

}