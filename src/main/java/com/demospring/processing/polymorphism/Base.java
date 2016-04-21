package com.demospring.processing.polymorphism;

public class Base {

    public int add(int x, int y) {
        System.out.println("inside A");
        return x+y;
    }

    public static void foo() {
        System.out.println("Test.foo() called ");
    }

    public static void foo(int a) {
        System.out.println("Test.foo(int) called ");
    }

    public static void display() {
        System.out.println("Static or class method from Base");
    }

    public void print()  {
        System.out.println("Non-static or Instance method from Base");
    }

    public void pass(Object x) {
        System.out.println("inside A");
    }
}
