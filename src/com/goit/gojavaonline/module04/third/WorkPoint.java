package com.goit.gojavaonline.module04.third;

public class WorkPoint {
    public static void main(String[] args) {
        Point fistPoint =  new Point(4,20);
        Point secondPoint = new Point(5,30);
        System.out.println("The distance: " + PointOperation.DistancePoints(fistPoint,secondPoint));
    }
}
