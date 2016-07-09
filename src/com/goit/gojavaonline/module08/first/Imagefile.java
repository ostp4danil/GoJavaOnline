package com.goit.gojavaonline.module08.first;

/**
 * Created by Danil-MAC on 22.06.16.
 */
class Imagefile extends File {
    private int[] resolution = new int[2];
    private static String imageStaticOutput = String.format(staticOutput, "Resolution");

    public Imagefile(String name, int size, int[] resolution) {
        super(name, size);
        this.resolution = resolution.clone();
    }

    @Override
    public String toString() {
        if (imageStaticOutput != null) {
            System.out.printf(imageStaticOutput);
            imageStaticOutput = null;
        }
        String output = "\n" + super.toString() + "\t" + resolution[0] + "X" + resolution[1] + "\n";
        return output;
    }

}