package com.goit.gojavaonline.module06.second;

/**
 * Created by Danil-MAC on 24.06.16.
 */
public class QSort {


    public static void doSort(int[] array, int start, int end) {
        if (start >= end)
            return;
        int i = start;
        int j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        QSort.doSort(array,start, cur);
        QSort.doSort(array,cur+1, end);
    }

}
