package com.goit.gojavaonline.module05.first;

import java.util.Random;

/**
 * Created by Danil-MAC on 24.06.16.
 */
public class RandomArray {

    private static Random rand = new Random();


    public static int[] randomize(int[] array) {
        array = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(200);
        }
        return array;
    }

}
