package com.debesh.spring.springcore.lifecycle.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInterfaceConfigPatient {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleinterface.xml");
        InterfacePatient patient = (InterfacePatient) context.getBean("patient");
        System.out.println("Patient: " + patient);
        System.out.println("Class name: " + patient.getClass().getName());
        context.registerShutdownHook();
    }
}
