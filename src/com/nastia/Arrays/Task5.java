package com.nastia.Arrays;

import java.util.Arrays;

public class Task5 {
    public static void main(String args[]) {
        int count_zero_lines = 0 ;
        boolean is_zero = false;
        int[][] numbers = new int[100][2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = (int) (Math.random() * (1 + 8));
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j] == 0){
                    is_zero = true;
                }
            }
            if(is_zero){
                System.out.println(Arrays.toString(numbers[i]));
                count_zero_lines++;
            }
            is_zero = false;
        }
        System.out.println(count_zero_lines);
    }
}
