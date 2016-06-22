package com.goit.gojavaonline.module04.first;

/**
 * Created by Danil-MAC on 22.06.16.
 */
public class Triangle extends Square {
    protected short a;
    protected short b;
    protected short c;

    public static short getA() {
        return a;
    }

    public void setA(short a) {
        this.a = a;
    }

    public static short getB() {
        return b;
    }

    public void setB(short b) {
        this.b = b;
    }

    public static short getC() {
        return c;
    }

    public void setC(short c) {
        this.c = c;
    }

    Triangle(short newA, short newB, short newC){
        a = newA;
        b = newB;
        c = newC;


    }

}
