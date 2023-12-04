package com.example;

public class ArrayOperations {
    // Exercise 1: Find the Maximum Value in an Array
    public static int findMaximumValue(int[] array) {
        // TODO: Implement the logic to find the maximum value in the array.
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;// Placeholder return value
    }

    // Exercise 2: Calculate the Average of Array Elements
    public static double calculateAverage(int[] array) {
        // TODO: Implement the logic to calculate the average of the array elements.
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }



    // Exercise 3: Reverse an Array
    public static int[] reverseArray(int[] array) {
        // TODO: Implement the logic to reverse the array.
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

}
