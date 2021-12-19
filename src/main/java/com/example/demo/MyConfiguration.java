package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MyConfiguration {

//    @Bean
    public  Printer myPrinter(){
        System.out.println("@Bean myPrinter");
        return new HpPrinter();
    }

//    @Bean
//    public  Printer yourPrinter(){
//        System.out.println("@Bean yourPrinter");
//        return new CanonPrinter();
//    }
}
