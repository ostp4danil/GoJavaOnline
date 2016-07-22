package com.goit.gojavaonline.module08.tableandsort;

import java.util.*;

public abstract class FileUtils {


    public static void printTable(Collection<File> collection) {
        String tmpClassName = "";
        Iterator<File> iterator = collection.iterator();
        for (File f: collection){
            String className = f.getClass().toGenericString();
            if (!className.equals(tmpClassName)) {
                tmpClassName = className;
                System.out.println("\n"+f.getHeader());
                printFiles(collection, className);
            }
        }
      /*  while (iterator.hasNext()) {
            String className = iterator.next().getClass().toGenericString();
            if (!className.equals(tmpClassName)) {
                System.out.println("\n"+iterator.next().getHeader());
                printFiles(collection, className);
                tmpClassName = className;
            }
        }*/

    }


    private static void printFiles(Collection<File> array, String className) {
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
        formatter.format("%20.20s", element.getUniqueField());
        System.out.println(formatter);
    }

    public static void tmp(Collection<File> f){
        for (File file: f){
            System.out.println(file.getName());
        }
    }
//    public static List<File> sortFiles(List<File> collection) {
//        List<File> sortedList = new ArrayList<>();
//        FileCompare compared = new FileCompare(collection);
//        sortedList.addAll(compared.sortedFiles);
//        return sortedList;
//    }

}

/*    public static List<File> sortByName(List<File> files) {
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
                int firstFileSize = sortingFiles.get(i).getSize();
                int secondFileSize = sortingFiles.get(j).getSize();
                if (firstFileSize < (secondFileSize)) {
                    Collections.swap(sortingFiles, i, j);
                }
            }
        }
        return sortingFiles;

    }*/


