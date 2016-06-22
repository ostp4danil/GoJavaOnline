package com.goit.gojavaonline.module04.first;

public class Triangle {
    private short a;
    private short b;
    private short c;


    Triangle(short newA, short newB, short newC) {
        a = newA;
        b = newB;
        c = newC;
    }

    public float calc()
    {
        int p=(a+b+c)/2;
        return (float) Math.sqrt(p*(p-a)+p*(p-b)+p*(p-c));
    }

}
