package com.goit.gojavaonline.test.module04.second;


import com.goit.gojavaonline.module04.second.TempConvertion;
import org.junit.Assert;
import org.junit.Test;




public class TempConvertionTest {

    private double expected;

    @Test(timeout = 1000)
    public void ToCelsiusWhen20Then68() throws Exception {
        expected = 68;
        Assert.assertEquals((int) expected % 10, (int) TempConvertion.convertToCelsius(20) % 10);
    }

    @Test(timeout = 1000, expected = NullPointerException.class)
    public void ToCelsiusWhenNullThenException() throws Exception {
        Assert.assertEquals((int) expected % 10, (int) TempConvertion.convertToCelsius(100) % 10);
    }

    @Test(timeout = 1000)
    public void ToFahrenheitWhen68Then20() throws Exception {
        expected = 20;
        Assert.assertEquals((int) expected % 10, (int) TempConvertion.convertToFahrenheit(68) % 10);
    }
}