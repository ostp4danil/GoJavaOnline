package com.goit.gojavaonline.module09;

/**
 * Created by Danil-MAC on 7/17/16.
 */
public class Runner {
    public static void main(String[] args) {
        String example = "goit java online";
        System.out.println("Entered text: " + example);
        CaesarsСipher text = new CaesarsСipher(example, 2);
        text.encode();
        System.out.println(text.getCipher().toString());
        text.decode();
        System.out.println(text.getCipher().toString());

    }
}
