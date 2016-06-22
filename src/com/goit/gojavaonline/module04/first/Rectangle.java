package com.goit.gojavaonline.module04.first;

/**
 * Created by Danil-MAC on 22.06.16.
 */
public class Rectangle extends Square{
    private short a;
    private short b;

    Rectangle(short newA, short newB){
        a = newA;
        b = newB;
    }

    public int calc(){

        return a*b;

    }

    public short getA() {
        return a;
    }

    public void setA(short a) {
        this.a = a;
    }

    public short getB() {
        return b;
    }

    public void setB(short b) {
        this.b = b;
    }


}

