package com.goit.gojavaonline.module08.first;

import java.util.Formatter;

public class AudioFile extends File {
    private int bitrate;

    public AudioFile(String name, double size, int bitrate) {
        super(name, size);
        this.bitrate = bitrate;
    }

    @Override
    protected Formatter getHeader(){
        Formatter formatter = super.getHeader();
        formatter.format("%20.20s", "Bitrate");
        return formatter;
    }

    public int getBitrate() {
        return bitrate;
    }

    public String getUniqueString() {
        return String.valueOf(getBitrate());
    }
}
