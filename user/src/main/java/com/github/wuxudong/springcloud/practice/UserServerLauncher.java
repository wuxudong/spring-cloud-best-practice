package com.github.wuxudong.springcloud.practice;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.CloudEurekaClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaClient
@RestController
public class UserServerLauncher {
    public static void main(String[] args) {
        SpringApplication.run(UserServerLauncher.class, args);
    }


    @Autowired
    private CloudEurekaClient cloudEurekaClient;


    @RequestMapping(value = "/user")
    public User user() {
        User u = new User();
        u.setId(1l);
        u.setName("demo");
        return u;
    }

    @RequestMapping(value = "/out-of-service")
    public void outOfService() {
        InstanceInfo instance = cloudEurekaClient.getApplicationInfoManager().getInfo();
        cloudEurekaClient.setStatus(InstanceInfo.InstanceStatus.OUT_OF_SERVICE, instance);
    }

    @RequestMapping(value = "/up")
    public void up() {
        InstanceInfo instance = cloudEurekaClient.getApplicationInfoManager().getInfo();
        cloudEurekaClient.setStatus(InstanceInfo.InstanceStatus.UP, instance);
    }


}
