package com.goit.gojavaonline.test.module04.first;

import com.goit.gojavaonline.module04.first.Area;
import com.goit.gojavaonline.module04.first.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParameterizedTriangleTest {
    private double sideA, sideB, sideC;
    private double expected;


    public ParameterizedTriangleTest(double sideA, double sideB, double sideC, double expeceted) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.expected = expeceted;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> data2() {
        return Arrays.asList(new Object[][]{
                {3, 4, 5, 6},
                {6, 8, 10, 24},
                {0, 0, 0, 0},
        });

    }

    @Test
    public void testCalulateArea() {
        Area result = new Triangle(sideA, sideB,sideC);
        Assert.assertEquals((int) expected %100, (int)result.calculateArea()%100);
    }

}
