package com.goit.gojavaonline.module04.third;

/**
 * Created by Danil-MAC on 23.06.16.
 */
public class Work {
    public static void main(String[] args) {
        Point fistPoint =  new Point(4,20);
        Point secondPoint = new Point(5,30);
        System.out.println("The distance: " + PointOperation.DistancePoints(fistPoint,secondPoint));
    }
}
