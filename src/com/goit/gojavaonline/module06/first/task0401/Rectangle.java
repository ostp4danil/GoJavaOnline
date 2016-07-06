package com.goit.gojavaonline.module06.first.task0401;

/**
 * Created by Danil-MAC on 22.06.16.
 */
class Rectangle implements Area {
    private double a;
    private double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Wrong data: " + a + b);
        }
    }

    @Override
    public double calculateArea() {
        return a * b;

    }


}

