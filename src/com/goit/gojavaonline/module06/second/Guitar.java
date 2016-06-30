package com.goit.gojavaonline.module06.second;

/**
 * Created by Danil-MAC on 22.06.16.
 */
class Guitar extends MusicInstrument {

    private static int value=0;

    public Guitar(String name) {
        super(name, value+1);
        value+=1;
    }

    public static int getValue() {
        return value;
    }


}