package com.goit.gojavaonline.module06.second;

abstract class MusicInstrument {

    private String name;

    public MusicInstrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name;
    }
}
