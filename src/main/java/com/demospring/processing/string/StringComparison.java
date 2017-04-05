package com.demospring.processing.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringComparison {

    public static void main(String[] args) {
        String s = "I am using IntelIJ to improve programming";
        String t = "am IntelIJ to improve";

        String[] strings = s.split(" ");
        String[] strings1 = t.split(" ");

        List<String> list = new ArrayList<>(Arrays.asList(strings));
        List<String> list1 = new ArrayList<>(Arrays.asList(strings1));

        list.removeAll(list1);

        String[] finalString = new String[list.size()];
        list.toArray(finalString);

        for(String str : finalString) {
            System.out.println(str);
        }
    }
}
