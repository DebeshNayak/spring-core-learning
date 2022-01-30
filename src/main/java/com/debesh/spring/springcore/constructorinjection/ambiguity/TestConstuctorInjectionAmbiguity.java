package com.debesh.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstuctorInjectionAmbiguity {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjectionambiguity.xml");
        Addition addition = (Addition) context.getBean("addition");
//        System.out.println(addition);
    }
}
