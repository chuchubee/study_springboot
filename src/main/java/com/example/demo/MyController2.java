package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/detail")
@RestController
public class MyController2 {

    @RequestMapping("/product")
    public String product(){
        return "apple";
    }

    @RequestMapping("/user")
    public String user(){
        return "Debby";
    }
}
