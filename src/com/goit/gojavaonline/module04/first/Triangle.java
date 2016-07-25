package com.goit.gojavaonline.module04.first;


public class Triangle implements Area{
    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c) {
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

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double getRadius()throws Exception {
        return 0;
    }
}
