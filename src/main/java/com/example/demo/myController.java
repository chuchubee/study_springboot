package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {

    @Autowired
    private Printer printer;
//    @Qualifier("myPrinter")



    @RequestMapping("/test")
    public String test(){
        printer.print("helloWorld");
        System.out.println("Hello");
        return "Hello world";
    }
}
