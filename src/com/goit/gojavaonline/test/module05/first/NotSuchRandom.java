package com.goit.gojavaonline.test.module05.first;

/**
 * Created by Danil-MAC on 7/25/16.
 */
public class NotSuchRandom extends Exception {
    private final String string = "This array contains too much same numbers!";

    public NotSuchRandom(){
        System.out.println(string);
    }
}
