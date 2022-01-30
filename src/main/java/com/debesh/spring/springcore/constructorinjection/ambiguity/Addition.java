package com.debesh.spring.springcore.constructorinjection.ambiguity;

public class Addition {

    public Addition(int a, double b) {
        System.out.println("Inside constructor DOUBLE");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

//    public Addition(int a, int b) {
//        System.out.println("Inside constructor INT");
//    }
//
//    public Addition(String a, String b) {
//        System.out.println("Inside constructor String");
//    }

}
