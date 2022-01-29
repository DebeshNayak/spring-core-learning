package com.debesh.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("Student: " + student);
        System.out.println("Model class: " + student.getScores().getClass().getName());
    }
}
