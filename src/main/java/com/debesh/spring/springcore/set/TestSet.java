package com.debesh.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSet {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("setconfig.xml");
        CarDealer cardealer = (CarDealer) context.getBean("cardealer");
        System.out.println("Car Dealer Name: " + cardealer.getName());
        System.out.println("Models: " + cardealer.getModels());
        System.out.println("Model class: " + cardealer.getModels().getClass().getName());
    }
}
