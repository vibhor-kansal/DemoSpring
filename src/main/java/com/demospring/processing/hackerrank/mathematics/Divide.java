package com.demospring.processing.hackerrank.mathematics;

import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {

        Divide divide = new Divide();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(divide.getDivisibilityResult(number));

    }

    public String getDivisibilityResult(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        }
        return "";
    }
}

