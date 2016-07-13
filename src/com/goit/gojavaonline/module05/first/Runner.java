package com.goit.gojavaonline.module05.first;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        final int SIZE = 20;
        int[] lottoBalls = new int[SIZE];
        lottoBalls = ArrayUtils.randomize(lottoBalls);

        System.out.println(Arrays.toString(lottoBalls));

        System.out.println("Maximum lotto number: " + ArrayUtils.searchMax(lottoBalls));

        System.out.println("Minimum lotto number: " + ArrayUtils.searchMin(lottoBalls));
    }
}