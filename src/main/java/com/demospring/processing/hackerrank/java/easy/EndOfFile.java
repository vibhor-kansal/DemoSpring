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

/*Input
Hello world
I am a file
Read me until end-of-file.
*/

/*Output
1 Hello world
2 I am a file
3 Read me until end-of-file.
*/