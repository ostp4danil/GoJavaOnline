package com.goit.gojavaonline.test.module09;

import com.goit.gojavaonline.module09.CaesarsСipher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CaesarsСipherTest {

    private CaesarsСipher cipher;
    private String text;
    private String aphabet;
    private int key;
    private String expected;

    @Test
    public void WhenKeyIs0ThenTextWillNotChange() {
        text = ("abcdef");
        aphabet = "Doesn't really mean";
        key = 0;
        cipher = new CaesarsСipher(aphabet, key);
        String expected = text;
        Assert.assertEquals(expected,cipher.encode(text));
    }

    @Test
    public void WhenAlphabetIsEmptyThenTextWillNotChange() {
        text = ("Doesn't really mean");
        aphabet = "";
        key = 0;
        cipher = new CaesarsСipher(aphabet, key);
        String expected = text;
        Assert.assertEquals(expected,cipher.encode(text));
    }

    @Test
    public void WhenKeyIs1ThenShouldBeNextLetterInAlphabet() {
        text = ("abcdefg");
        aphabet = "abcdefg";
        key = 1;
        cipher = new CaesarsСipher(aphabet, key);
        String expected = "bcdefga";
        Assert.assertEquals(expected,cipher.encode(text));
    }

    @Test
    public void WhenKeyIsNegativeThenCipherStillWorks(){
        text = ("bcdef");
        aphabet = "abcde";
        key = -1;
        cipher = new CaesarsСipher(aphabet, key);
        String expected = "abcdf";
        Assert.assertEquals(expected,cipher.encode(text));
    }

}