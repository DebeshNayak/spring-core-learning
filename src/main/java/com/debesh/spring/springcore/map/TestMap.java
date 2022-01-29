package com.debesh.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("mapconfig.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println("Customer: " + customer);
        System.out.println("Model class: " + customer.getProducts().getClass().getName());
    }
}
