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

/*Input
2
0 2 10
5 3 5
*/

/*Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/