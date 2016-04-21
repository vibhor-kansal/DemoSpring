package com.demospring.processing.polymorphism;

public class Derived extends Base {

    public int add(int x, int y) {
        System.out.println("inside B");
        return x+y;
    }

    public static void display() {
        System.out.println("Static or class method from Derived");
    }

    public void print() {
        System.out.println("Non-static or Instance method from Derived");
    }

    public void pass(Integer x) {
        System.out.println("inside B");
    }
}
