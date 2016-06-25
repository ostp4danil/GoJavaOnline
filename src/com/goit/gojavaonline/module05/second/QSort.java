package com.goit.gojavaonline.module05.second;

/**
 * Created by Danil-MAC on 24.06.16.
 */
public abstract class QSort {


    public static int[] startSort(int[] takenArray) {
        int[] returnableArray = new int[takenArray.length];
        int firstElement;
        int lastElememt;
        returnableArray = takenArray.clone();
        firstElement = 0;
        lastElememt = returnableArray.length;
        quickSearchBody(returnableArray, firstElement, lastElememt - 1);
        return returnableArray;
    }

    private static void quickSearchBody(int[] workingArray, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int currentPosition = i - (i - j) / 2;
        while (i < j) {
            while (i < currentPosition && (workingArray[i] <= workingArray[currentPosition])) {
                i++;
            }
            while (j > currentPosition && (workingArray[currentPosition] <= workingArray[j])) {
                j--;
            }
            if (i < j) {
                int temp = workingArray[i];
                workingArray[i] = workingArray[j];
                workingArray[j] = temp;
                if (i == currentPosition) {
                    currentPosition = j;
                } else if (j == currentPosition)
                    currentPosition = i;
            }
        }
        QSort.quickSearchBody(workingArray, start, currentPosition);
        QSort.quickSearchBody(workingArray,currentPosition + 1, end);
    }


}
