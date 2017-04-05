package com.demospring.processing.polymorphism;

import com.demospring.processing.dto.Person;

public class Overloading {

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.convertToString(new Person("vibhor", 25));
    }

    public void convertToString(Object o) {
        System.out.println("inside Object " + o);
    }

    public void convertToString(Person person) {
        System.out.println("inside string " + person);
    }
}