package com.goit.gojavaonline.module06.second;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Danil-MAC on 22.06.16.
 */
abstract class MusicInstrument {

    private String name;
    private static int elementsValue;

    protected MusicInstrument(String name, int elementsValue){
        this.name = name;
        this.elementsValue = elementsValue;
    }

    public static int getElementsValue(){
        return elementsValue;
    }
}
