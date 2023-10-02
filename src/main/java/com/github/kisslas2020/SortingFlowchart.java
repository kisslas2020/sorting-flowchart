package com.github.kisslas2020;

import java.util.Arrays;

public class SortingFlowchart {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 56, 32, 51, 2, 8, 92, 15};
        System.out.println("Original array: " + Arrays.toString(numbers));
        sortArray(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    private static void sortArray(int[] numbers) {
        for(int i = 1; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length - i; j++) {
                int num1 = numbers[j];
                int num2 = numbers[j + 1];
                if(num1 > num2) {
                    numbers[j] = num2;
                    numbers[j + 1] = num1;
                }
            }
        }
    }
}