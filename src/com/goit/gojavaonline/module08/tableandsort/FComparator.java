package com.goit.gojavaonline.module08.tableandsort;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Danil-MAC on 7/17/16.
 */

public class FComparator {
    private SortedSet<String> nameSet = new TreeSet<String>();
    private SortedSet<Integer> sizeSet = new TreeSet<Integer>();

    public FComparator(List<File> files) {
        for (File file : files) {
            nameSet.add(file.getName());
            sizeSet.add(file.getSize());
        }
    }

    public void showByName() {
        System.out.println(nameSet);
    }

    public void showBySize() {
        System.out.println(sizeSet);
    }


}
