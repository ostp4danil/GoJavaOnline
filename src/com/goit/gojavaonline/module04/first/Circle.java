package com.goit.gojavaonline.module04.first;

/**
 * Created by Danil-MAC on 22.06.16.
 */
public class Circle extends Square{
    private short radius;

    Circle(short newRadius){
        radius = newRadius;
    }

    public float calc(){

        return (float) (Math.PI*Math.pow(radius,2));

    }

    public short getRadius() {
        return radius;
    }

    public void setRadius(short radius) {
        this.radius = radius;
    }

}
