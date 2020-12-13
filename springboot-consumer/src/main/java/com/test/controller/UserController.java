package com.test.controller;

import com.test.api.UserAPI;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @DubboReference(url="dubbo://127.0.0.1:20880/com.test.api.UserAPI")
    private UserAPI userAPI;
    @GetMapping("queryUserNameByUserId")
    public String queryUserNameByUserId(){
        String result="hello test springboot+dubbo !";
        return userAPI.queryUserNameById(result);
    }
}
