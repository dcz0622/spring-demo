package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype") // Singleton pattern by default. Uncomment this line to use prototype pattern.
public class Alien {
    
    private int id;
    private String name;
    @Autowired
    private Ufo ufo;
    
    public Alien() {
        System.out.println("Instantiating an alien...");
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Ufo getUfo() {
        return ufo;
    }

    public void setUfo(Ufo ufo) {
        this.ufo = ufo;
    }
    
    public void greet() {
        System.out.println("こんにちは。エイリアン「" + name + "」です。");
        ufo.greet();
    }
    
}
