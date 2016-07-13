package com.goit.gojavaonline.module06.second;

public class UnknownInstrumentException extends Exception {
    private String instrumentName;

    public UnknownInstrumentException(final String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getInstrumentName() {
        return instrumentName;
    }
}
