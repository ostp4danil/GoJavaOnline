package com.goit.gojavaonline.module09;

/**
 * Created by Danil-MAC on 7/17/16.
 */
public class Runner {
    public static void main(String[] args) {
        String example = "GoITJavaOnline";
        System.out.println("Entered text: " + example);
        CaesarsСipher text = new CaesarsСipher(example);
        text.encode(3);
        System.out.println(text.getCipher().toString());
        text.decode(3);
        System.out.println(text.getCipher().toString());

    }
}
