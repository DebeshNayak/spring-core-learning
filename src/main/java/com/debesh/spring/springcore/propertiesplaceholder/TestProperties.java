package com.debesh.spring.springcore.propertiesplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProperties {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertiesplaceholder.xml");
        MyDAO dao = (MyDAO) context.getBean("myDAO");
        System.out.println(dao);
    }
}
