package com.goit.gojavaonline.module04.first;

public class Triangle implements Area{
    private double a;
    private double b;
    private double c;


    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea()
    {
        double p=(a+b+c)/2;
        return  Math.sqrt(p*(p-a)+p*(p-b)+p*(p-c));
    }

}
