package com.goit.gojavaonline.module09;

/**
 * Created by Danil-MAC on 7/17/16.
 */
public class Runner {
    public static void main(String[] args) {
        String example = "goitjavaonline";
        System.out.println("Entered text: " + example);
        CaesarsСipher cipher = new CaesarsСipher("qwerty",2);
        String encoded = cipher.encode(example);
        System.out.println(encoded);
        String decoded = cipher.decode(encoded);
        System.out.println(decoded);

    }
}
