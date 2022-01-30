package com.debesh.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstuctorInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjection.xml");
        ConstructorEmployee employee = (ConstructorEmployee) context.getBean("constructoremployee");
        System.out.println(employee);
    }
}
