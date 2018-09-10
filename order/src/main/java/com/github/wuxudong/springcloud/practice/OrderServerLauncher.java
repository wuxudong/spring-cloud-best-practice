package com.github.wuxudong.springcloud.practice;

import com.github.wuxudong.springcloud.practice.Order;
import com.github.wuxudong.springcloud.practice.client.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class OrderServerLauncher {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(OrderServerLauncher.class, args);
    }



    @RequestMapping(value = "/order")
    public Order order() {
        Order o = new Order();
        o.setId(1l);
        o.setTotal(100);

        o.setUser(userService.getUser());
        return o;
    }

}
