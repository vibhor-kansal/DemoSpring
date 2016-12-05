package com.demospring.processing.singleton;

public class Singleton implements Cloneable {

    private static Singleton singleton;

    private Singleton() {
        throw new RuntimeException("Can not access singleton object");
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void display() {
        System.out.println("I am singleton object");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
