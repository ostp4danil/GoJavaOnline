package com.goit.gojavaonline.module06.second;

/**
 * Created by Danil-MAC on 24.06.16.
 */
public class Runner {
    public static void main(String[] args) {

        final int SIZE = 50;
        randomArray myArray = new randomArray(SIZE);
        myArray.showArray();
        QSort.doSort(myArray.getMyArray(),0,(49));
        myArray.showArray();

    }
}
