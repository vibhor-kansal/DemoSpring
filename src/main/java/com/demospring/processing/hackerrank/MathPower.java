package com.demospring.processing.hackerrank;

import java.util.Scanner;

public class MathPower {

    public static void main(String[] args) {
        MathPower calc = new MathPower();
        Scanner scanner = new Scanner(System.in);
        int[] vars = new int[8];
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
