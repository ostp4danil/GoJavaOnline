package com.goit.gojavaonline.module04.first;

import java.util.EmptyStackException;

public class Circle implements Area{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){

        return  Math.PI*Math.pow(radius,2);

    }

    @Override
    public double getA() throws Exception{
        return 0;
    }

    @Override
    public double getB() throws Exception{
        return 0;
    }

    @Override
    public double getC() throws Exception{
        return 0;
    }

    public double getRadius() {
        return radius;
    }


}
