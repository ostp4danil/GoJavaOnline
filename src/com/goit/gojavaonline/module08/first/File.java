package com.goit.gojavaonline.module08.first;

import java.util.Collection;
import java.util.Formatter;

abstract class File {

    private String name;
    private double size;

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

    protected String getName() {
        return name;
    }

    protected double getSize() {
        return size;
    }

    protected String getUniqueString() {
        return "Error! Something went wrong.";
    }


}
