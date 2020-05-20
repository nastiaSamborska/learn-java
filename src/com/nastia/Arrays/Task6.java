package com.nastia.Arrays;

import java.util.Arrays;
public class Task6 {
    public static void main(String args[]) {
        int[][] numbers = new int[100][100];
        float [] average_array = new float[100];
        float average_value;
        int sum = 0;
        int sum_even_numbers = 0;
        int sum_odd_numbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = j + 1;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
            average_value = sum / numbers[i].length;
            average_array[i] = average_value;
        }
        for (int i = 0; i < average_array.length; i++) {
            if (i % 2 == 1) {
                sum_odd_numbers += average_array [i];
            }else{
                sum_even_numbers += average_array [i] ;
            }
        }
        System.out.println(Arrays.toString(average_array));
        System.out.println ("sum_odd_numbers :" + sum_odd_numbers);
        System.out.println ("sum_even_numbers :" + sum_even_numbers);

    }
}
