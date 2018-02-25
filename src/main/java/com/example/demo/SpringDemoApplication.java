package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {
    
    public static void main(String[] args) {
        ConfigurableApplicationContext appContext = SpringApplication.run(SpringDemoApplication.class, args);
        
//        Alien a = new Alien();
        // Normally, we instantiate an object using the `new` keyword like this. However in Spring framework, we do not
        // use the `new` keyword, because we want to better control our objects. A controlled object in Spring is known
        // as a "bean". Instead of manually instantiating objects, we ask the bean factory to give us a bean.
        
        Alien a1 = appContext.getBean(Alien.class);
        a1.setName("Alice");
        a1.greet();
        
        Alien a2 = appContext.getBean(Alien.class);
        a2.greet();
    }
    
}
