package com.demospring.processing.polymorphism;

public class Overloading {

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.convertToString(null);
    }

    public void convertToString(Object o) {
        System.out.println(o);
    }

    public void convertToString(String string) {
        System.out.println(string);
    }
}