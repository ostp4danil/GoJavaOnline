package com.goit.gojavaonline.module05.first;

/**
 * Created by Danil-MAC on 25.06.16.
 */
public class FinderInMass {

    public static int search(int [] arr, int element){

        for (int i=0; i<arr.length; i++)
            if (arr[i] == element) {
                return arr[i];
        }
        System.out.println("Element not found");
        return 0;
    }
}
