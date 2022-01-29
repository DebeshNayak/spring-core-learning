package com.debesh.spring.springcore.lifecycle.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationConfigPatient {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleannotation.xml");
        AnnotationPatient patient = (AnnotationPatient) context.getBean("patient");
        System.out.println("Patient: " + patient);
        System.out.println("Class name: " + patient.getClass().getName());
        context.registerShutdownHook();
    }
}
