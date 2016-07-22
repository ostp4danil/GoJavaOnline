package com.goit.gojavaonline.module08.tableandsort;

import java.util.*;

public abstract class FileUtils {


    public static void printTable(Collection<File> collection) {
        Iterator<File> iterator = collection.iterator();
        ArrayList<String> classNames = new ArrayList<>();
        while (iterator.hasNext()) {
            String className = iterator.next().getClass().toGenericString();
            if (!classNames.contains(className)) {
                System.out.println("\n" + iterator.next().getHeader());
                printFiles(collection, className);
                classNames.add(className);
            }
        }

    }


    private static void printFiles(Collection<File> printable, String className) {
        for (File file : printable) {
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

    public static void printFileList(Collection<File> collection){
        System.out.printf("%20.20s", "NAME");
        System.out.printf("%20.20s", "SIZE\n");
        for (File file: collection){
            Formatter formatter = new Formatter();
            formatter.format("%20.20s", file.getName());
            formatter.format("%20.20s", file.getSize());
            System.out.println(formatter);
        }
    }
}


