package com.demospring.processing.hackerrank.mathematics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Handshake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i= 0; i< tests; i++) {
            list.add(scanner.nextInt());
        }
        for(Integer integer : list) {
            System.out.println(determineHandShakes(integer));
        }
        scanner.close();
    }

    private static int determineHandShakes(int memberCount) {
        if(memberCount == 1) {
            return 0;
        } else if(memberCount == 2) {
            return 1;
        } else {
            return determineHandShakes(memberCount - 1) + memberCount - 1;
        }
    }
}

/*Input
2
1
2
*/

/*Output
0
1
*/

/*Explanation
Case 1 : The lonely board member shakes no hands, hence 0.
Case 2 : There are 2 board members, 1 handshake takes place.
*/
