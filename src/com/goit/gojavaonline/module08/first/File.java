package com.goit.gojavaonline.module08.first;

/**
 * Created by Danil-MAC on 22.06.16.
 */
abstract class File {

    private String name;
    private double size;
    protected static String staticOutput = "Name\t\t\t Size \t\t %s \n";

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        String output = name + "\t\t\t " + size + " \t\t";
        return output;
    }

}
