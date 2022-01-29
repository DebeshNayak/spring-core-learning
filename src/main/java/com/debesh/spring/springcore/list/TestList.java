package com.debesh.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestList {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("listconfig.xml");
        Hospital hospital = (Hospital) context.getBean("hospital");
        System.out.println("Hospital Name: " + hospital.getName());
        System.out.println("Departments: " + hospital.getDepartments());
        System.out.println("Departments class: " + hospital.getDepartments().getClass());
    }
}
