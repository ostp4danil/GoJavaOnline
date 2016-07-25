package com.goit.gojavaonline.test.module04.first;

import com.goit.gojavaonline.module04.first.Area;
import com.goit.gojavaonline.module04.first.Circle;
import com.goit.gojavaonline.module04.first.Rectangle;
import com.goit.gojavaonline.module04.first.Triangle;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

public class AreaTest {

    private static Area triangle;
    private static Area rectangle;
    private static Area circle;

    @BeforeClass
    public static void setUp() throws Exception {
        Random rand = new Random();
        triangle = new Triangle(rand.nextDouble(), rand.nextDouble(), rand.nextDouble());
        rectangle = new Rectangle(rand.nextDouble(), rand.nextDouble());
        circle = new Circle(rand.nextDouble());

    }

    @Test
    public void calculateAreaTest() throws Exception {
        double triangleA = triangle.getA();
        double triangleB = triangle.getB();
        double triangleC = triangle.getC();
        double rectangleA = rectangle.getA();
        double rectangleB = rectangle.getB();
        double radius = circle.getRadius();

        double p = (triangleA + triangleB + triangleC) / 2;
        double triangleResult = Math.sqrt(p * (p - triangleA) + p * (p - triangleB) + p * (p - triangleC));
        Assert.assertEquals((int) (triangleResult % 1000), (int) (triangle.calculateArea() % 1000));

        double rectangleResult = rectangleB * rectangleA;
        Assert.assertEquals((int) rectangleResult % 1000, (int) rectangle.calculateArea() % 1000);

        double circleResult = Math.PI * Math.pow(radius, 2);
        Assert.assertEquals((int) circleResult % 1000, (int) circle.calculateArea() % 1000);

    }


}