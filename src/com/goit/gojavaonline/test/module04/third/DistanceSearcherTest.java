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

    @Before
    public void setUp() throws Exception {
        Random rand = new Random();
        point1 = new Point(rand.nextInt(), rand.nextInt());
        point2 = new Point(rand.nextInt(), rand.nextInt());
    }

    @Test(timeout = 1000)
    public void findDistanceTest() throws Exception {
        double expected = Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2)
                + Math.pow(point2.getY() - point1.getY(), 2));
        Assert.assertEquals((int) expected % 100, (int) DistanceSearcher.findDistance(point1, point2) % 100);
    }

}