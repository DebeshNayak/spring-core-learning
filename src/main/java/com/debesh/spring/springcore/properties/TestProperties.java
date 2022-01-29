package com.debesh.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProperties {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("propertiesconfig.xml");
        CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages) context.getBean("countriesAndLang");
        System.out.println("Countries and Languages: " + countriesAndLanguages);
        System.out.println("Model class: " + countriesAndLanguages.getCountryAndLangs().getClass().getName());
    }
}
