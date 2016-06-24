package com.goit.gojavaonline.module05.second;

/**
 * Created by Danil-MAC on 24.06.16.
 */
public class QSort {

    private static int[] arr;
    private static int firstElement;
    private static int lastElememt;

    public static int[] startSort(int[] array) {
        arr = new int[array.length];
        for (int i = 0; i < arr.length; i++)
            arr[i] = array[i];
        firstElement = 0;
        lastElememt= arr.length;
        doSort(firstElement,lastElememt-1);
        return arr;
    }

    private static void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start;
        int j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (arr[i] <= arr[cur])) {
                i++;
            }
            while (j > cur && (arr[cur] <= arr[j])) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        QSort.doSort(start, cur);
        QSort.doSort(cur+1, end);
    }

    public  static void showArray(){
        for (int i=0; i<arr.length; i++){
            System.out.printf(arr[i]+ " ");
        }
    }

}
