package com.demospring.processing.hackerrank.java.easy;

import java.util.Scanner;

public class Java1DArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ints = new int[n];
        int count = 0, sum;
        for(int i = 0; i < ints.length ; i++) {
            ints[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += ints[j];

                if (sum < 0) count++;
            }
        }
        System.out.println(count);
    }
}

/*Input
5
1 -2 4 -5 1
*/

/*Output
9
*/

/* Explanation
These are the ranges of the 9 negative subarrays in this sample:

[0:1]
[0:3]
[0:4]
[1:1]
[1:3]
[1:4]
[2:3]
[3:3]
[3:4]
 */