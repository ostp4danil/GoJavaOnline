package com.goit.gojavaonline.module06.second;

/**
 * Created by Danil-MAC on 7/3/16.
 */
public class UnknownInstrumentException extends Exception{
    private String instrumentName;

    public UnknownInstrumentException(final String instrumentName){
        this.instrumentName = instrumentName;
    }

    public String getInstrumentName(){
        return instrumentName;
    }
}
