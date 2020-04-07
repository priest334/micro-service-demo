package cn.wthmox.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name="simple-service", path="/simple")
public interface SayHelloWorld { 
 
    @GetMapping("/hello")
    public String hello();
}