package com.nastia.Arrays;

public class Task2 {
    public static void main(String args[]) {
        int[] numbers = new int[10000];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }

        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i])
                max = numbers[i] ;
            else if (min > numbers[i])
                min = numbers[i];
        }
        System.out.println("Sum:"+ sum);
        System.out.println("Max:"+ max);
        System.out.println("Min:"+ min);
    }

}
