package com.goit.gojavaonline.module05.first;

/**
 * Created by Danil-MAC on 25.06.16.
 */
public abstract class ArrayUtils {

    public static int searchMax(int[] array) {

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int searchMin(int[] array) {

        int min = 200;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


}
