package com.goit.gojavaonline.module08.tableandsort;

import java.util.Formatter;

public class TextFile extends File {
    private int numberOfSymbols;

    public TextFile(String name, double size, int numberOfSymbols) {
        super(name, size);
        this.numberOfSymbols = numberOfSymbols;
    }

    @Override
    protected Formatter getHeader(){
        Formatter formatter = super.getHeader();
        formatter.format("%20.20s", "Symbols");
        return formatter;
    }

    public int getNumberOfSymbols() {
        return numberOfSymbols;
    }

    public String getUniqueString() {
        return  String.valueOf(getNumberOfSymbols());
    }
}
