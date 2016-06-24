package com.goit.gojavaonline.module04.third;

/**
 * Created by Danil-MAC on 24.06.16.
 */
public class DistanceSearcher {
    public static double distancePoints(Point p1, Point p2){
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}
