package com.goit.gojavaonline.module04.first;

/**
 * Created by Danil-MAC on 22.06.16.
 */
public class Rectangle implements Area{
    private double a;
    private double b;

    Rectangle(double  a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea(){

        return a*b;

    }



}
