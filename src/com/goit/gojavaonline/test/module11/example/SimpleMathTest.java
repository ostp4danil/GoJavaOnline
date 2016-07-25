package com.goit.gojavaonline.test.module11.example;

import com.goit.gojavaonline.module11.example.SimpleMath;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleMathTest {

    private static SimpleMath simpleMath;

    @BeforeClass
    public static void setUpClass() throws Exception {
        simpleMath = new SimpleMath();
        System.out.println("setUpmethod called");
    }


    @Test(timeout = 3000)
    public void testAdd() throws Exception {
        final int a = 4;
        final int b = 7;

        final int result = simpleMath.add(a, b);

        assertEquals(11, result);

    }

    @Test(timeout = 3000)
    public void testSub() throws Exception {
        final int a = 42;
        final int b = 15;
        final int result = simpleMath.sub(a, b);

        assertEquals(a - b, result);

    }

    @Test(timeout = 3000)
    public void testModulo() throws Exception {
        final int a = 17;
        final int b = 3;

        final int result = simpleMath.modulo(a, b);
        assertEquals(a % b, result);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDiv() throws Exception {
        final int a = 17;
        final int b = 3;

        simpleMath.div(a, b);

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After called");

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("Static after called");
    }
}