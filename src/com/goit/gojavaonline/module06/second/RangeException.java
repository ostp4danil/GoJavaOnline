package com.goit.gojavaonline.module06.second;

import java.beans.Expression;

/**
 * Created by Danil-MAC on 7/3/16.
 */
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
