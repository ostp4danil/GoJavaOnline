package com.goit.gojavaonline.module08.tableandsort;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by Danil-MAC on 7/9/16.
 */
public class Runner {
    public static void main(String[] args) {
        List<File> list = new ArrayList<>();

        list.add(new AudioFile("Kirkorov", 15, 320));
        list.add(new AudioFile("50_Cent", 15, 320));
        list.add(new AudioFile("50_Cent", 15, 320));
        list.add(new AudioFile("50_Cent", 15, 320));

        int[] resolution = {640, 480};
        list.add(new Imagefile("Joconda", 150, resolution));
        list.add(new Imagefile("Joconda", 150, resolution));
        list.add(new Imagefile("Joconda", 150, resolution));

        list.add(new TextFile("Azbuka", 300, 9687543));
        list.add(new TextFile("Azbuka", 300, 9687543));

        FileIUtils.printTable(list);

        List<File> sortedList = FileIUtils.sortByName(list);
        System.out.println("\n\n Print sorted by name:");
        FileIUtils.printAll(sortedList);

        sortedList = FileIUtils.sortBySize(list);
        System.out.println("\n\n Print sorted by Size:");
        FileIUtils.printAll(sortedList);
    }
}
