package com.goit.gojavaonline.module08.first;

import java.util.Formatter;

/**
 * Created by Danil-MAC on 22.06.16.
 */
class Imagefile extends File {
    private int[] resolution = new int[2];

    public Imagefile(String name, int size, int[] resolution) {
        super(name, size);
        this.resolution = resolution.clone();
    }

    @Override
    protected Formatter getHeader(){
        Formatter formatter = super.getHeader();
        formatter.format("%20.20s", "Resolution");
        return formatter;
    }


    public int[] getResolution() {
        return resolution;
    }

    public String getUniqueString() {
        return resolution[0] + "x" + resolution[1];
    }
}