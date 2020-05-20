package com.nastia.Arrays;

import java.util.Arrays;

public class Task4 {
    public static void main(String args[]) {
        int[] number = new int[8];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * (1 + 9) + 1);

        }
        System.out.println(Arrays.toString(number));
        for (int i = 0; i < number.length; i++) {
            if (i % 2 == 1) {
                number[i] = 0;
            }
        }
        System.out.println(Arrays.toString(number));
    }

}
