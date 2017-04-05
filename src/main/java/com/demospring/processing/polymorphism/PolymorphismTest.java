package com.demospring.processing.polymorphism;

public class PolymorphismTest {
    public static void main(String[] args) {
        Base base = new Derived();
        base.add(1, 2);
        base.display();
    }
}
