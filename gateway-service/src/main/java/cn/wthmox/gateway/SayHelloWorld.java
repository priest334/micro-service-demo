package cn.wthmox.gateway;

import org.springframework.cloud.openfeign.FeignClient;

import feign.RequestLine;


@FeignClient("simple-service")
public interface SayHelloWorld {
 
    @RequestLine("GET /simple/hello")
    public String hello();
}