package com.demospring.processing.string;

import javax.print.DocFlavor;

public class ReverseOfString {

    public static void main(String[] args) {

        //First way using StringBuilder
        String string = "vibhor kansal";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder = stringBuilder.reverse();
        System.out.println(stringBuilder);
        /*for (int i=0;i<stringBuilder.length();i++) {
            System.out.print(stringBuilder.charAt(i));
        }*/

        //Second way to iterate over
        String original = "vibhor kansal";
        String reverse = "";
        int length = original.length();
        for (int i = length -1; i >= 0 ; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println(reverse);
    }
}
