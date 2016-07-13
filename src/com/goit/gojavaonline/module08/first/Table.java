package com.goit.gojavaonline.module08.first;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Formatter;
import java.util.List;

/**
 * Created by Danil-MAC on 7/7/16.
 */
public abstract class Table {


    public static void printTable(Collection collection) {
        List<File> array = new ArrayList<>();
        array.addAll(collection);
        String tmpClassName = "";
        int counterOfTypes = 0;
        while (array.size() > counterOfTypes) {
            String className = array.get(counterOfTypes).getClass().toGenericString();
            if (!className.equals(tmpClassName)) {
                System.out.println(array.get(counterOfTypes).getHeader());
                removeAndPrint(array, className);
                tmpClassName = className;
            }
            counterOfTypes++;
        }

    }


    private static void removeAndPrint(List<File> array, String className) {
        for (File file : array) {
            String currentClassName = file.getClass().toGenericString();
            if (currentClassName.equals(className)) {
                printCurrentFile(file);
            }
        }
    }

    private static void printCurrentFile(File element) {
        Formatter formatter = new Formatter();
        formatter.format("%20.20s", element.getName());
        formatter.format("%20.20s", element.getSize());
        formatter.format("%20.20s", element.getUniqueString());
        System.out.println(formatter);
    }

}
