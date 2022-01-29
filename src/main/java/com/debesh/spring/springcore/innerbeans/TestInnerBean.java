package com.debesh.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInnerBean {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("innerbean.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);
    }

}
