package com.goit.gojavaonline.module08.tableandsort;


import java.util.ArrayList;
import java.util.List;


public class Runner {
    public static void main(String[] args) {
        List<File> list = new ArrayList<>();

        list.add(new AudioFile("Kirkorov", 15, 320));
        list.add(new AudioFile("Baskov", 3, 512));
        list.add(new AudioFile("Rotaru", 17, 128));

        int[] resolution = {640, 480};
        list.add(new Imagefile("Scream", 150, resolution));
        list.add(new Imagefile("Kartina maslom", 999, resolution));
        list.add(new Imagefile("Square", 750, resolution));

        list.add(new TextFile("Kursach", 1, 9687543));
        list.add(new TextFile("Document", 333, 9687543));

        FileIUtils.sortFiles(list);
        FileIUtils.printTable(list);
    }
}
