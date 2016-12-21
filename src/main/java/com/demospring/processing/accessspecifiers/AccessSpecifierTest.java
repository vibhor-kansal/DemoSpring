package com.demospring.processing.accessspecifiers;

public class AccessSpecifierTest {

    public static void main(String[] args) {
        A a = new A();
        a.setFirstName("Vibhor");
        a.setLastName("Kansal");
        System.out.println("access specified to " + a.getFirstName() + " " + a.getLastName());
    }
}
