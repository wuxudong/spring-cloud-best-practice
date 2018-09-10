package com.github.wuxudong.springcloud.practice.client;


import com.github.wuxudong.springcloud.practice.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@FeignClient(name = "user")
public interface UserService {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    User getUser();
}
