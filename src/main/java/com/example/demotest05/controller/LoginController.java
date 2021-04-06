package com.example.demotest05.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class LoginController {
    @RequestMapping({"/","/login"})
    public String login(){
        return "login";
    }
}
