package com.goit.gojavaonline.test.module11.example;

import com.goit.gojavaonline.module11.example.SimpleMath;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class ParameterizedSimpleMathTest {

    private int numberA, numberB;
    private int expeceted;

    public ParameterizedSimpleMathTest(int numberA, int numberB, int expeceted) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expeceted = expeceted;
    }

    @Parameterized.Parameters(name = "(index): multiply ((0]*[1))=[2]")
    public static Iterable<Object[]> data1() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1},
                {2, 2, 4},
                {8, 2, 16},
                {4, 5, 20}
        });

    }

    @Test
    public void testMu1t() {
        Assert.assertEquals(expeceted, new SimpleMath().mult(numberA, numberB));
    }
}