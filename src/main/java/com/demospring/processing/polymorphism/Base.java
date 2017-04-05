package com.demospring.processing.polymorphism;

public class Base {

    public int add(int x, int y) {
        System.out.println("inside A");
        return x+y;
    }

    public static void display() {
        System.out.println("Static or class method from Base");
    }

    public void print()  {
        System.out.println("Non-static or Instance method from Base");
    }

    public void pass() {
        System.out.println("inside A");
    }
}
