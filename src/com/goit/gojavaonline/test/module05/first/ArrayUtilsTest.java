package com.goit.gojavaonline.test.module05.first;

import com.goit.gojavaonline.module05.first.ArrayUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by Danil-MAC on 7/25/16.
 */
public class ArrayUtilsTest {
    private int[] numbers;
    private int maximum;
    private int minimum;

    @Before
    public void setUp() throws Exception {
        Random rand = new Random();
        numbers = new int[10];
        maximum = -1;
        minimum = 100;
        for (int i=0; i<numbers.length; i++) {
            numbers[i]=rand.nextInt(50);
            if (numbers[i]>maximum){
              //  System.out.println("!");
                maximum=numbers[i];
            }
            if (numbers[i]<minimum){
                minimum=numbers[i];
            }
        }
    }

    @Test
    public void searchMax() throws Exception {
        Assert.assertEquals(maximum,ArrayUtils.searchMax(numbers));
    }

    @Test
    public void searchMin() throws Exception {
        Assert.assertEquals(minimum,ArrayUtils.searchMin(numbers));

    }

    //Creates Exception if more then 1/3 of array are the same numbers
    @Test
    public void randomize() throws Exception {
            int counter = 0;
            for (int i=0; i<numbers.length-1; i++){
                if(numbers[i]==numbers[i+1]) {
                    counter++;
                }
                if (counter>(numbers.length/3)){
                    System.out.println(counter);
                    throw new NotSuchRandom();
                }
            }

    }

    @Test
    public void quickSort() throws Exception {
        int[] result = numbers.clone();
        Arrays.sort(result);
        Assert.assertArrayEquals(result,ArrayUtils.quickSort(numbers));
    }

}