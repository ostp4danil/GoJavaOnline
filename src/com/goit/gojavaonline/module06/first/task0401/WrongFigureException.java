package com.goit.gojavaonline.module06.first.task0401;

/**
 * Created by Danil-MAC on 6/28/16.
 */
public class WrongFigureException extends Exception {
    private String figureName;

    public WrongFigureException(final String name){
        this.figureName = name;
    }

    public String getFigureName() {
        return figureName;
    }
}
