package com.demospring.processing.hackerrank.mathematics;

import java.util.Scanner;

public class FibonacciFinding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        if(numberOfTests <= 1000 && numberOfTests >= 1) {
            int exp = (int) Math.pow(10, 9);
            int f0, f1, fn, n;
            while(scanner.hasNext()) {
                f0 = scanner.nextInt();
                f1 = scanner.nextInt();
                n = scanner.nextInt();
                fn = f0 + f1;
                if(n == 1) {
                    fn = f1;
                } else {
                    if((f0 >= 1 && f0 <= exp) && (f1 >= 1 && f1 <= exp) && (n >= 1 && n <= exp)) {
                        for(int j = 0; j < n - 2; j++) {
                            f0 = f1;
                            f1 = fn;
                            fn = f0 + f1;
                        }
                    }
                }
                System.out.println(fn);
            }
            scanner.close();
        }
    }
}
