package com.goit.gojavaonline.module08.tableandsort;

import java.util.Formatter;

public abstract class File {

    protected String name;
    protected double size;

    protected File(String name, double size) {
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

    public double getSize() {
        return size;
    }

    protected String getUniqueString() {
        return "Error! Something went wrong.";
    }


}
