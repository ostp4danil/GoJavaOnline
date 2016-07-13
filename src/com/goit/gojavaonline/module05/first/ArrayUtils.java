package com.goit.gojavaonline.module05.first;


import java.util.Random;

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

        int min = searchMax(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] randomize(int[] array) {
        Random rand = new Random();
        array = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(200);
        }
        return array;
    }


    public static int[] quickSort(int[] gotArray) {
        int[] sortedArray = gotArray.clone();
        int firstIndex;
        int lastIndex;
        firstIndex = 0;
        lastIndex = sortedArray.length;
        quickSortBody(sortedArray, firstIndex, lastIndex - 1);
        return sortedArray;
    }

    private static void quickSortBody(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int currentPosition = i - (i - j) / 2;
        while (i < j) {
            while (i < currentPosition && (array[i] <= array[currentPosition])) {
                i++;
            }
            while (j > currentPosition && (array[currentPosition] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == currentPosition) {
                    currentPosition = j;
                } else if (j == currentPosition)
                    currentPosition = i;
            }
        }
        quickSortBody(array, start, currentPosition);
        quickSortBody(array, currentPosition + 1, end);
    }

}
