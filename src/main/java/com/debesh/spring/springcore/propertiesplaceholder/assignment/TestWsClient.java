package com.debesh.spring.springcore.propertiesplaceholder.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWsClient {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertiesplaceholderwsclient.xml");
        WsClient wsClient = (WsClient) context.getBean("wsclient");
        System.out.println(wsClient);
    }
}
