package com.goit.gojavaonline.test.module04.second;


import com.goit.gojavaonline.module04.second.TempConvertion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;


public class TempConvertionTest {

    private double unconverted;
    private double expected;

    @Before
    public void setUp() throws Exception {
        Random rand = new Random();
        unconverted = rand.nextDouble();
    }


    @Test(timeout = 1000)
    public void convertToCelsiusTest() throws Exception {
        expected = (unconverted - 32) / 1.8;
        Assert.assertEquals((int) expected % 10, (int) TempConvertion.convertToCelsius(unconverted) % 10);
    }

    @Test(timeout = 1000)
    public void convertToFahrenheitTest() throws Exception {
        expected = (unconverted * 1.8) / 32;
        Assert.assertEquals((int) expected % 10, (int) TempConvertion.convertToFahrenheit(unconverted) % 10);
    }
}