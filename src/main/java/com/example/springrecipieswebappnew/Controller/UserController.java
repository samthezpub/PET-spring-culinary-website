package com.example.springrecipieswebappnew.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping(path = "/")
    public String home(){

        return "home";
    }
}
