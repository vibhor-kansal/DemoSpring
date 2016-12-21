package com.demospring.processing.array;

public class FindSecondLargest {

    public static void main(String[] args) {

        int[] numbers = {6,3,37,12,46,5,64,21};
        int largest = 0, secondLargest = 0;

        for (int n : numbers) {
            if (largest < n) {
                secondLargest = largest;
                largest = n;
            } else if (secondLargest < n) {
                secondLargest = n;
            }
        }

        System.out.println("largest number is : " + largest);
        System.out.println("second largest number is : " + secondLargest);
    }
}
