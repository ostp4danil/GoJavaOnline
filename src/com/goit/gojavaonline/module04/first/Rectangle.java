package com.goit.gojavaonline.module04.first;

/**
 * Created by Danil-MAC on 22.06.16.
 */
public class Rectangle {
    private short a;
    private short b;

    Rectangle(short newA, short newB){
        a = newA;
        b = newB;
    }

    public int calc(){

        return a*b;

    }



}

