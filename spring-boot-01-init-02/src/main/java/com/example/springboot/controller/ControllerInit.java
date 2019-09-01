package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerInit {

    @ResponseBody
    @RequestMapping("/info")
    public String init(){
        return "hello init";
    }
}
