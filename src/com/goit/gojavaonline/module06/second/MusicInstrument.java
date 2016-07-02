package com.goit.gojavaonline.module06.second;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Danil-MAC on 22.06.16.
 */
abstract class MusicInstrument {

    private String name;

    public MusicInstrument(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString(){
        return name;
    }
}
