package com.scm.contactmanger.controller;

// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/dashboard")
    public String userDashboard(){
        return "user/dashboard";
    }


    public String userProfile(){
        return "user/profile";
    }
}

