package com.goit.gojavaonline.test.module04.first;

import com.goit.gojavaonline.module04.first.Area;
import com.goit.gojavaonline.module04.first.Rectangle;
import com.goit.gojavaonline.module04.first.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParameterizedRectangleTest {
    private double sideA, sideB;
    private double expected;


    public ParameterizedRectangleTest(double sideA, double sideB, double expeceted) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.expected = expeceted;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> data2() {
        return Arrays.asList(new Object[][]{
                {3, 4, 12},
                {0, 8, 0},
                {0, 0, 0},
        });

    }

    @Test
    public void testCalulateArea() {
        Area result = new Rectangle(sideA, sideB);
        Assert.assertEquals((int) expected %100, (int)result.calculateArea()%100);
    }

}