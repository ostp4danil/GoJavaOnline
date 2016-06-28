package com.goit.gojavaonline.module06.first.task0502;

import com.goit.gojavaonline.module05.first.ArrayUtils;

import java.util.Arrays;

/**
 * Created by Danil-MAC on 24.06.16.
 */
class Runner {
    public static void main(String[] args) {

        final int SIZE = 20;

        int[] myArray = new int[SIZE];
        myArray = ArrayUtils.randomize(myArray);

        System.out.println(Arrays.toString(myArray));
        System.out.println();

        int[] sortedMass = ArrayUtils.quickSort(myArray);
        System.out.println(Arrays.toString(sortedMass));

        System.out.println("\nChecking native array stay being unsorted:");
        System.out.println(Arrays.toString(myArray));

    }
}
