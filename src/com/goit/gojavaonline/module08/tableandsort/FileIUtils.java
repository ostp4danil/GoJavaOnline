package com.goit.gojavaonline.module08.tableandsort;

import java.util.*;

/**
 * Created by Danil-MAC on 7/7/16.
 */
public abstract class FileIUtils {


    public static void printTable(Collection collection) {
        List<File> array = new ArrayList<>();
        array.addAll(collection);
        String tmpClassName = "";
        int counterOfTypes = 0;
        while (array.size() > counterOfTypes) {
            String className = array.get(counterOfTypes).getClass().toGenericString();
            if (!className.equals(tmpClassName)) {
                System.out.println(array.get(counterOfTypes).getHeader());
                printFiles(array, className);
                tmpClassName = className;
            }
            counterOfTypes++;
        }

    }


    private static void printFiles(List<File> array, String className) {
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

    public static void printAll(List<File> collection){
        collection.forEach(FileIUtils::printCurrentFile);
    }

    public static List<File> sortByName(List<File> files) {
        List<File> sortingFiles = files;

        for (int i = 0; i < sortingFiles.size(); i++) {
            for (int j = i + 1; j < sortingFiles.size(); j++) {
                String firstFileName = sortingFiles.get(i).getName();
                String secondFileName = sortingFiles.get(j).getName();
                if (firstFileName.compareTo(secondFileName) > 0) {
                    Collections.swap(sortingFiles, i, j);
                }
            }
        }

        return sortingFiles;
    }

    public static List<File> sortBySize(List<File> files) {
        List<File> sortingFiles = files;
        for (int i = 0; i < sortingFiles.size(); i++) {
            for (int j = i + 1; j < sortingFiles.size(); j++) {
                double firstFileSize = sortingFiles.get(i).getSize();
                double secondFileSize = sortingFiles.get(j).getSize();
                if (firstFileSize < (secondFileSize)) {
                    Collections.swap(sortingFiles, i, j);
                }
            }
        }
        return sortingFiles;

    }

}
