package com.goit.gojavaonline.module06.first.task0403;

class PointDemo {
    public static void main(String[] args) {
        Point fistPoint =  new Point(4,20);
        Point secondPoint = new Point(5,30);
        System.out.println("The distance: " + DistanceSearcher.findDistance(fistPoint,secondPoint));
    }
}