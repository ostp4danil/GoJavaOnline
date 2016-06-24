package com.goit.gojavaonline.module05.second;

import com.goit.gojavaonline.module05.first.RandomArray;

/**
 * Created by Danil-MAC on 24.06.16.
 */
public class Runner {
    public static void main(String[] args) {

        final int SIZE = 50;

        RandomArray myArray = new RandomArray(SIZE);
        myArray.showArray();
        System.out.println();
        int[] sortedMass = QSort.startSort(myArray.getMyArray());
        for (int i=0; i<sortedMass.length; i++)
            System.out.printf(sortedMass[i] + " ");
        System.out.println("\nCheckout:");
        myArray.showArray();

    }
}
