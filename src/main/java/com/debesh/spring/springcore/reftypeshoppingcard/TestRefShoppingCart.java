package com.debesh.spring.springcore.reftypeshoppingcard;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRefShoppingCart {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("refshoppingcartconfig.xml");
        ShoppingCart shoppingcart = (ShoppingCart) context.getBean("shoppingcart");
        System.out.println("Student: " + shoppingcart);
        System.out.println("Model class: " + shoppingcart.getItem().getClass().getName());
    }
}
