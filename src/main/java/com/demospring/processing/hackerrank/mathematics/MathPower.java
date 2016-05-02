package com.demospring.processing.hackerrank.mathematics;

import java.util.Scanner;

public class MathPower {

    public static void main(String[] args) {
        MathPower calc = new MathPower();
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        int[] vars = new int[numberOfTests * 2];
        for(int i = 0; i < vars.length; i++) {
            vars[i] = scanner.nextInt();
        }
        for(int i = 0; i < vars.length; i++) {
            try {
                System.out.println(calc.power(vars[i], vars[i+1]));
            } catch(Exception ex) {
                System.out.println(ex.getMessage());
            } finally {
                i++;
            }
        }
    }

    private int power(int n, int p) throws Exception {
        if(n<0 || p<0) throw new Exception("n and p should be non-negative");
        if(p == 0) return 1;
        return n*power(n,p-1);
    }
}

/*Input
4
1 3
2 5
-8 -9
-8 2
*/

/*Output
1
32
n and p should be non-negative
n and p should be non-negative
*/