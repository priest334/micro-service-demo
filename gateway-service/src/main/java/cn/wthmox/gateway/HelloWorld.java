package cn.wthmox.gateway;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import feign.codec.Decoder;
import feign.codec.StringDecoder;


@Service
@RestController
public class HelloWorld {
    @Autowired
    private SayHelloWorld sayHelloWorld;

    @Bean
    public Decoder decoder() {
        return new StringDecoder();
    }

    @GetMapping("/simple/say")
    public String hello(){
        String x = sayHelloWorld.hello() + "123";
        return x;
    }

}