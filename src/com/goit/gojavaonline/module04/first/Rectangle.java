package com.goit.gojavaonline.module04.first;

/**
 * Created by Danil-MAC on 22.06.16.
 */

public class Rectangle implements Area{
    private double a;
    private double b;

    public Rectangle(double  a, double b){
        this.a = a;
        this.b = b;
    }

    public double calculateArea(){

        return a*b;

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double getC() throws Exception{
        return 0;
    }

    @Override
    public double getRadius() throws Exception{
        return 0;
    }
}

