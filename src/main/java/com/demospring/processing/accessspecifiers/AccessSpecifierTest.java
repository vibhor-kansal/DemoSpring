package com.demospring.processing.accessspecifiers;

public class AccessSpecifierTest {

    public static void main(String[] args) {
        A a = new A();
        a.setFirstName("Vibhor");
        a.setLastName("Kansal");
        System.out.println("access specified to " + a.getFirstName() + " " + a.getLastName());
    }
}

/*
            | Class | Package | Subclass | Subclass | World
            |       |         |(same pkg)|(diff pkg)|
————————————+———————+—————————+——————————+——————————+————————
public      |   +   |    +    |    +     |     +    |   +
————————————+———————+—————————+——————————+——————————+————————
protected   |   +   |    +    |    +     |     +    |   o
————————————+———————+—————————+——————————+——————————+————————
no modifier |   +   |    +    |    +     |     o    |   o
————————————+———————+—————————+——————————+——————————+————————
private     |   +   |    o    |    o     |     o    |   o

        + : accessible
        o : not accessible

*/