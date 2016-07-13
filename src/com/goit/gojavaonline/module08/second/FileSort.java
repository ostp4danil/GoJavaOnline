package com.goit.gojavaonline.module08.second;

import com.goit.gojavaonline.module05.first.ArrayUtils;
import com.goit.gojavaonline.module08.first.File;
import com.goit.gojavaonline.module08.first.Table;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class FileSort {
    // private List<File> files = new ArrayList<>();

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
