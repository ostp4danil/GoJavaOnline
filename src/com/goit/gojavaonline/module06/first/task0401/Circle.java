package com.goit.gojavaonline.module06.first.task0401;

/**
 * Created by Danil-MAC on 22.06.16.
 */
class Circle implements Area {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){

        return  Math.PI*Math.pow(radius,2);

    }

}
