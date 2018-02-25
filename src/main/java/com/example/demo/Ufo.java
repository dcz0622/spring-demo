package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Ufo {
    
    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void greet() {
        System.out.println("こんにちは。ユーフォ「" + name + "」です。");
    }
    
}
