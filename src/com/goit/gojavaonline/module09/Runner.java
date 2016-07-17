package com.goit.gojavaonline.module09;

/**
 * Created by Danil-MAC on 7/17/16.
 */
public class Runner {
    public static void main(String[] args) {
        String excample = "abc def";
        CaesarsСipher text = new CaesarsСipher(excample);
        text.encode(3);
        System.out.println(text.getCipher().toString());
        text.decode(3);
        System.out.println(text.getCipher().toString());

    }
}
