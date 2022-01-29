package com.debesh.spring.springcore.lifecycle.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationConfigTicketReservation {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleassignment.xml");
        TicketReservation ticketreservation = (TicketReservation) context.getBean("ticketreservation");
        context.registerShutdownHook();
    }
}
