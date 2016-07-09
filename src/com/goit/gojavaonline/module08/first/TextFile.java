package com.goit.gojavaonline.module08.first;

/**
 * Created by Danil-MAC on 22.06.16.
 */
class TextFile extends File {
    private int numberOfSymbols;
    private static String textStaticOutput = String.format(staticOutput, "Symbols:");

    public TextFile(String name, double size, int numberOfSymbols) {
        super(name, size);
        this.numberOfSymbols = numberOfSymbols;
    }

    @Override
    public String toString() {
        if (textStaticOutput != null) {
            System.out.printf(textStaticOutput);
            textStaticOutput = null;
        }
        String output = "\n" + super.toString() + "\t" + numberOfSymbols + "\n";
        return output;
    }
}
