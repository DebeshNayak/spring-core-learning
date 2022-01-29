package com.debesh.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrescriptionConfig {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("prescriptiondependencycheck.xml");
        Prescription prescription = (Prescription) context.getBean("prescription");
        System.out.println("Prescription: " + prescription);
    }
}
