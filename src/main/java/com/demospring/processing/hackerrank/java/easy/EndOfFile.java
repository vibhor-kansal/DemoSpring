package com.demospring.processing.hackerrank.java.easy;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lineNumber= 1;
        while(scan.hasNext()) {
            String readLine = scan.nextLine();
            System.out.println(lineNumber + " " + readLine);
            lineNumber++;
        }
    }
}
