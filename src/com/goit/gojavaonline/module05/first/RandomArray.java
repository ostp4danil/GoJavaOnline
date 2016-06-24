package com.goit.gojavaonline.module05.first;

import java.util.Random;

/**
 * Created by Danil-MAC on 24.06.16.
 */
public class RandomArray {
    private int[] array;
    private static Random randomize = new Random();;

    public RandomArray(int size) {
        array = new int[size];
        for (int i = 0; i <array.length; i++) {
            array[i] = randomize.nextInt(200);
        }
    }

    public  int[] getMyArray() {
        return array;
    }

    public  void showArray(){
        for (int i=0; i<array.length; i++){
            System.out.printf(array[i]+ " ");
        }
    }



}
