package com.goit.gojavaonline.module08.tableandsort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


public class FileComparator {
    public Comparator<File> nameComparator = new Comparator<File>() {
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
            File other = (File) obj;
            return ((File) obj).getName().equals(other.name) && ((File) obj).getSize() == other.size;
        }
    };

    public Comparator<File> sizeComparator = new Comparator<File>() {
        @Override
        public int compare(File o1, File o2) {
            if (o1.getSize() < o2.getSize()) {
                return -1;
            } else if (o1.getSize() == o2.getSize()) {
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
            File other = (File) obj;
            return ((File) obj).getName().equals(other.name) && ((File) obj).getSize() == other.size;
        }
    };
}
