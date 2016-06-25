package com.goit.gojavaonline.module05.first;

/**
 * Created by Danil-MAC on 25.06.16.
 */
public class ArrayUtils {

    private static int max = 0;
    private static int min = 0;

    public static int searchMax(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int searchMin(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


}
