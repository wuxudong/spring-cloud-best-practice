package com.github.wuxudong.springcloud.practice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayLauncher {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayLauncher.class, args);
    }
}
