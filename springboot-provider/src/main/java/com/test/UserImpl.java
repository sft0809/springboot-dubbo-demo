package com.test;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.api.UserAPI;
import org.springframework.beans.factory.annotation.Value;

@Service
public class UserImpl implements UserAPI {
    @Value("${dubbo.application.name}")
    private String serviceName;
    @Override
    public String queryUserNameById(String userId) {
        return "hello dubbo:" + userId;
    }
}
