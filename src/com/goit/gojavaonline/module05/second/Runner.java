package com.goit.gojavaonline.module05.second;

import com.goit.gojavaonline.module05.first.RandomArray;

import java.util.Arrays;

/**
 * Created by Danil-MAC on 24.06.16.
 */
public class Runner {
    public static void main(String[] args) {

        final int SIZE = 20;

        int[] myArray = new int[SIZE];
        myArray = RandomArray.randomize(myArray);

        System.out.println(Arrays.toString(myArray));
        System.out.println();

        int[] sortedMass = QSort.startSort(myArray);
        System.out.println(Arrays.toString(sortedMass));

        System.out.println("\nChecking native array stay be unsorted:");
        System.out.println(Arrays.toString(myArray));

    }
}
