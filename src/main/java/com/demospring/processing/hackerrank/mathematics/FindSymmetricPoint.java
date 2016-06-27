package com.demospring.processing.hackerrank.mathematics;

import java.util.Scanner;

public class FindSymmetricPoint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();
        for (int i = 0; i < tests; i++) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            findNextPoint(x1, x2, y1, y2);
        }
    }

    private static void findNextPoint(int x1, int x2, int y1, int y2) {
        int x, y;
        x = 2 * x2 - x1;
        y = 2 * y2 - y1;
        System.out.println(x + " " + y);
    }
}

/*Input
2
0 0 1 1
1 1 2 2
*/

/*Output
2 2
3 3
*/