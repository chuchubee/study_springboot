package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HpPrinter implements Printer{

    @Value("${printer.name}")
    private String name;

    @Value("${printer.count}")
    private int count=0;

//    @PostConstruct
    public void iniit(){
        count=5;
    }

    @Override
    public void print(String msg) {
        count--;
        System.out.println( name +":"+ msg);
        System.out.println("count="+ count);

    }
}
