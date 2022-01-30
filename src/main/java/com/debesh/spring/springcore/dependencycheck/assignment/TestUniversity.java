package com.debesh.spring.springcore.dependencycheck.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUniversity {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("dependencycheckuniversity.xml");
        University university = (University) context.getBean("university");
        System.out.println("University: " + university);
        System.out.println("University address: " + university.hashCode());
        University university1 = (University) context.getBean("university");
        System.out.println("University: " + university1);
        System.out.println("University address: " + university1.hashCode());
        context.registerShutdownHook();
    }
}
