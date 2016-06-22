package com.goit.gojavaonline.module04.first;

/**
 * Created by Danil-MAC on 22.06.16.
 */
public abstract class Work {
    public static void main(String[] args) {

        Circle newCircle = new Circle((short)5);
        Rectangle newRectangle = new Rectangle((short) 4, (short) 5);
        Triangle newTriangle = new Triangle((short) 3, (short) 4, (short) 5);
        System.out.println("Circle: " + newCircle.calc());
        System.out.println("Triangle: " + newTriangle.calc());
        System.out.println("Rectangle: " + newRectangle.calc());
    }
}
