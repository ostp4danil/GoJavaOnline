package com.goit.gojavaonline.module08.first;

/**
 * Created by Danil-MAC on 22.06.16.
 */
class AudioFile extends File {
    private int bitrate;
    private static String audioStaticOutput = String.format(staticOutput, "Bitrate");

    public AudioFile(String name, double size, int bitrate) {
        super(name, size);
        this.bitrate = bitrate;
    }

    @Override
    public String toString() {
        if (audioStaticOutput != null) {
            System.out.printf(audioStaticOutput);
            audioStaticOutput = null;
        }
        String output = "\n" + super.toString() + "\t" + bitrate;
        return output;
    }

}
