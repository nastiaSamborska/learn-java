package com.nastia.Arrays;

import java.util.Arrays;

public class Task3 {
    public static void SeasonsWrite(String seasons[]) {
        String temp;
        for (int i = 0; i < seasons.length / 2; i++) {
            temp = seasons[i];
            seasons[i] = seasons[seasons.length - i - 1];
            seasons[seasons.length - i - 1] = temp;

        }
        System.out.println(Arrays.toString(seasons));
    }

    public static void main(String args[]) {
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
        SeasonsWrite(seasons);
    }
}

