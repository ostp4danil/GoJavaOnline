package com.goit.gojavaonline.module08.tableandsort;

import java.util.Formatter;

public abstract class File {

    protected String name;
    protected int size;

    protected File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    protected Formatter getHeader() {
        Formatter formatter = new Formatter();
        formatter.format("%20.20s", "Name");
        formatter.format("%20.20s", "Size");
        return formatter;
    }



    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    protected String getUniqueField() {
        return "Error! Something went wrong.";
    }



  /*  @Override public boolean equals(Object other) {
        if (!(other instanceof File)) {
            return false;
        }
        File otherFile = (File) other;
        return name.equals(otherFile.name) && size == otherFile.size;
    }

    @Override public int hashCode() {
        return name.length()*size; // For example...
    }

    @Override
    public int compareTo(File other) {
        if (name.compareTo(other.name)<0 || (name.equals(other.name) && size < other.size)) {
            return -1;
        }
        return name.equals(other.name) && size == other.size ? 0 : 1;
    }*/

}
