package com.zhaochunqi.spring.springprojectdemo.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean isValidate(String name, String password) {
        return name.equalsIgnoreCase("hello")
                && password.equalsIgnoreCase("world");
    }
}
