package com.goit.gojavaonline.test.module04.third;

import com.goit.gojavaonline.module04.third.DistanceSearcher;
import com.goit.gojavaonline.module04.third.Point;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class DistanceSearcherTest {

    private Point point1;
    private Point point2;

    @Test(timeout = 1000)
    public void WhenSameThen0() throws Exception {
        point1 = new Point(1,1);
        point2 = new Point(1,1);
        double expected = 0;
        Assert.assertEquals((int) expected % 100, (int) DistanceSearcher.findDistance(point1, point2) % 100);
    }

    @Test(timeout = 1000)
    public void WhenFirst00Second11Then141() throws Exception {
        point1 = new Point(0,0);
        point2 = new Point(1,1);
        double expected = 1.41;
        Assert.assertEquals((int) expected % 10, (int) DistanceSearcher.findDistance(point1, point2) % 10);
    }

    @Test(timeout = 1000, expected = NullPointerException.class)
    public void WhenNotInitializeThenNullPointerException() throws Exception {
        point2 = new Point(1,1);
        double expected = 0;
        Assert.assertEquals((int) expected % 10, (int) DistanceSearcher.findDistance(point1, point2) % 10);
    }




}