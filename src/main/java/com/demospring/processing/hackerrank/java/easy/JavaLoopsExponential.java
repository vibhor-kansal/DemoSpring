package com.demospring.processing.hackerrank.java.easy;

import java.util.Scanner;

public class JavaLoopsExponential {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        for (int n = 1; n <= cases; n++) {
            int A = s.nextInt();
            int B = s.nextInt();
            int N = s.nextInt();
            int total = A;
            for (int i = 0; i < N; i++) {
                total += Math.pow(2, i) * B;
                System.out.print(total + " ");
            }
            System.out.println();
        }
    }
}
