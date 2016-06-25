package com.goit.gojavaonline.module05.first;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        final int SIZE = 20;
        int[] lottoBalls = new int[SIZE];
        lottoBalls = RandomArray.randomize(lottoBalls);

        System.out.println(Arrays.toString(lottoBalls));

        System.out.println("Maximum lotto number: " + FinderInMass.searchMax(lottoBalls));

        System.out.println("Minimum lotto number: " + FinderInMass.searchMin(lottoBalls));
    }
}