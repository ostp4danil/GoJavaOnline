package com.goit.gojavaonline.test.module04.first;

import com.goit.gojavaonline.module04.first.Area;
import com.goit.gojavaonline.module04.first.Circle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;


@RunWith(value = Parameterized.class)
public class ParameterizedCircleTest {
    private double radius;
    private double expected;


    public ParameterizedCircleTest(double radius, double expeceted) {
        this.radius = radius;
        this.expected = expeceted;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> data2() {
        return Arrays.asList(new Object[][]{
                {0, 0},
                {1, 3.14},
                {2, 3.14 * 4}
        });

    }

    @Test
    public void testCalulateArea() {
        Area result = new Circle(radius);
        Assert.assertEquals((int) expected % 10, (int) result.calculateArea() % 10);
    }

}