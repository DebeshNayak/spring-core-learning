package com.debesh.spring.springcore.lifecycle.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlConfigPatient {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecyclexmlconfig.xml");
        Patient patient = (Patient) context.getBean("patient");
        System.out.println("Patient: " + patient);
        System.out.println("Class name: " + patient.getClass().getName());
        context.registerShutdownHook();
    }
}
