package com.demospring.processing.hackerrank.analytical;

import java.util.Scanner;

public class Staircase {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        Staircase staircase = new Staircase();
        staircase.returnLeftStaircase(height);
        staircase.returnRightStaircase(height);
    }

    private void returnLeftStaircase(int height) {
        for(int i = 0; i< height; i++) {
            for(int j = 0; j < height; j++) {
                if(i + j >= height - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private void returnRightStaircase(int height) {
        for(int i = 0; i< height; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

/*Input
5
*/

/*Output
    #
   ##
  ###
 ####
#####
#
##
###
####
#####
*/