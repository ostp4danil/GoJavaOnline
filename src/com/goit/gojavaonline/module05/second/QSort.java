package com.goit.gojavaonline.module05.second;

/**
 * Created by Danil-MAC on 24.06.16.
 */
public abstract class QSort {

    private static int[] returnableArray;
    private static int firstElement;
    private static int lastElememt;

    public static int[] startSort(int[] takenArray) {
        returnableArray = new int[takenArray.length];
        returnableArray = takenArray.clone();
        firstElement = 0;
        lastElememt = returnableArray.length;
        quickSearchBody(firstElement, lastElememt - 1);
        return returnableArray;
    }

    private static void quickSearchBody(int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int currentPosition = i - (i - j) / 2;
        while (i < j) {
            while (i < currentPosition && (returnableArray[i] <= returnableArray[currentPosition])) {
                i++;
            }
            while (j > currentPosition && (returnableArray[currentPosition] <= returnableArray[j])) {
                j--;
            }
            if (i < j) {
                int temp = returnableArray[i];
                returnableArray[i] = returnableArray[j];
                returnableArray[j] = temp;
                if (i == currentPosition) {
                    currentPosition = j;
                } else if (j == currentPosition)
                    currentPosition = i;
            }
        }
        QSort.quickSearchBody(start, currentPosition);
        QSort.quickSearchBody(currentPosition + 1, end);
    }


}
