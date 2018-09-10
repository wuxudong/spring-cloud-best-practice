package com.github.wuxudong.springcloud.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerLauncher {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerLauncher.class, args);
    }

}
