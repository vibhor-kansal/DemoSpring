package com.demospring.processing.string;

public class StringTest {

    private static String string = "dsgfgf";

    public static void main(String[] args) {
        String s = "Sachin Tendulkar";
        System.out.println(s.substring(6));// Tendulkar
        System.out.println(s.substring(0, 6));//Sachin
        String s1 = "gnijn";
        System.out.println(s1.equals(""));
        StringTest stringTest = new StringTest();
        System.out.println("Old String : " + string);
        string = stringTest.returnStringNewValue("");
        System.out.println("New String : " + string);
        System.out.println(null instanceof String);
    }

    private String returnStringNewValue(String s1) {
        String str = (s1.equals("") || s1 instanceof String) ? s1 : string;
        return str;
    }
}

