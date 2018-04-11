package com.zhaochunqi.spring.springprojectdemo.controller;

import com.zhaochunqi.spring.springprojectdemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/login")
    public String loginMessage(){
        return "login";
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam String username, @RequestParam String password, ModelMap modelMap) {
        if(!loginService.isValidate(username,password)) {
            return "login";
        }

        modelMap.put("username", username);
        modelMap.put("password", password);

        return "welcome";
    }
}
