package com.goit.gojavaonline.module06.second;

import java.util.Random;

/**
 * Created by Danil-MAC on 24.06.16.
 */
public class randomArray {
    private int[] array;
    private Random randomize;
    private int size;

    randomArray(int size) {
        this.size = size;
        array = new int[size];
        randomize = new Random();
        for (int i = 0; i <=array.length; i++) {
            array[i] = randomize.nextInt(200);
        }
    }

    public  int[] getMyArray() {
        return array;
    }

    public  void showArray(){
        for (int i=0; i<=array.length ; i++){
            System.out.printf(array[i]+ " ");
        }
    }



}
