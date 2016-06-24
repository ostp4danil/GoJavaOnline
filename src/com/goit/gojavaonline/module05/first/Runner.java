package com.goit.gojavaonline.module05.first;

import java.util.Scanner;

/**
 * Created by Danil-MAC on 24.06.16.
 */
public class Runner {
    public static void main(String[] args) {

        final int SIZE = 50;
        RandomArray myArray = new RandomArray(SIZE);
        myArray.showArray();
        System.out.printf("\nEnter element you want to found: ");
        Scanner scanner = new Scanner(System.in);
        int wantedNumber =  scanner.nextInt();
        int result = FinderInMass.search(myArray.getMyArray(),wantedNumber);
        System.out.println("Here is! " + result);
    }
}
