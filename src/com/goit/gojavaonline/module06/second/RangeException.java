package com.goit.gojavaonline.module06.second;

import java.beans.Expression;

/**
 * Created by Danil-MAC on 7/3/16.
 */
public class RangeException extends Exception{
    private int value;

    public RangeException(final int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
