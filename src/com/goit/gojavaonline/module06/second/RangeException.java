package com.goit.gojavaonline.module06.second;


public class RangeException extends Exception {
    private int value;
    private String name;

    public RangeException(final int value, final String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
