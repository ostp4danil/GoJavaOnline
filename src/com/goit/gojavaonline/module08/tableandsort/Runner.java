package com.goit.gojavaonline.module08.tableandsort;


import java.util.*;


public class Runner {
    public static void main(String[] args) {
        List<File> list = new ArrayList<>();
        Comparator<File> nameComparator = new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                if (o1.getName().compareTo(o2.getName()) < 0) {
                    return -1;
                } else if (o1.getName().equals(o2.getName())) {
                    return 0;
                } else {
                    return 1;
                }
            }

            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                if (!(obj instanceof File)) {
                    return false;
                }
                File other =  (File) obj;
                return ((File) obj).getName().equals(other.name) && ((File) obj).getSize() == other.size;
            }
        };

        list.add(new AudioFile("Kirkorov", 15, 320));
        list.add(new AudioFile("Baskov", 40, 512));
        list.add(new AudioFile("Rotaru", 17, 128));

        int[] resolution = {640, 480};
        list.add(new Imagefile("Scream", 150, resolution));
        list.add(new Imagefile("Kartina maslom", 999, resolution));
        list.add(new Imagefile("Square", 750, resolution));

        list.add(new TextFile("Kursach", 1, 5));
        list.add(new TextFile("Document", 333, 9687543));

        SortedSet<File> set = new TreeSet<>(nameComparator);
        set.addAll(list);
        FileUtils.tmp(set);

        System.out.println("Unsorted: ");
        FileUtils.printTable(list);
        System.out.println("\nSorted: ");
        FileUtils.printTable(set);
    }
}
