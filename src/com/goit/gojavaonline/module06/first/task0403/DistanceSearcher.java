package com.goit.gojavaonline.module06.first.task0403;

/**
 * Created by Danil-MAC on 24.06.16.
 */
class DistanceSearcher {
    public static double findDistance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}
