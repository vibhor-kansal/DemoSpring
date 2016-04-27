package com.demospring.processing.hackerrank.mathematics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciFinding {

    private static List<Integer> subList;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i= 0; i < tests * 3; i++) {
            list.add(scanner.nextInt());
        }
        subList = new ArrayList<>();
        for(Integer integer : list) {
            subList.add(integer);
            if(subList.size() == 3) {
                System.out.println(fibonacci(subList.get(2)));
                subList.clear();
            }
        }
        scanner.close();
    }

    private static int fibonacci(int number) {
        if(number == 0 || number == 1) {
            return subList.get(number);
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
