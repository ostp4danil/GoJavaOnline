package com.goit.gojavaonline.module04.first;

/**
 * Created by Danil-MAC on 22.06.16.
 */
public class Circle {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){

        return  Math.PI*Math.pow(radius,2);

    }

}
