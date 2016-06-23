package com.goit.gojavaonline.module04.first;

/**
 * Created by Danil-MAC on 22.06.16.
 */
public class Circle {
    private short radius;

    Circle(short newRadius){
        radius = newRadius;
    }

    public float calculateArea(){

        return (float) (Math.PI*Math.pow(radius,2));

    }

    public short getRadius() {
        return radius;
    }

    public void setRadius(short radius) {
        this.radius = radius;
    }

}
