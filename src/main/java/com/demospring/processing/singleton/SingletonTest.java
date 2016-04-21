package com.demospring.processing.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class SingletonTest {

    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getInstance();
        singleton.display();

        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        Singleton singleton1 = constructor.newInstance(new Object[0]);
        singleton1.display();

        Method method = Singleton.class.getDeclaredMethod("display", null);
        method.setAccessible(true);
        method.invoke(singleton1);

        Singleton singleton2 = (Singleton) singleton1.clone();
        singleton2.display();
    }
}
