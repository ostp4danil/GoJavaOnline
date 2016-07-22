package com.goit.gojavaonline.module08.tableandsort;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


public class FileCompare {
    public TreeSet<File> sortedFiles = new TreeSet<>();

    public FileCompare(List<File> list){
        sortedFiles.addAll(list);
    }

}
