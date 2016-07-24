package com.goit.gojavaonline.module10;


import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamOerations {

    private final String name;

    public StreamOerations(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void writeToFile(final String data, final File file) throws IOException {
        FileWriter out = new FileWriter(file);
        try {
            char[] dataInCharArray = new char[data.length()];
            data.getChars(0, data.length(), dataInCharArray, 0);
            for (char symbol : dataInCharArray) {
                out.write(symbol);
            }
        } finally {
            out.close();
        }
    }

    public String readFromFile(File file) throws IOException {
        FileReader in = new FileReader(file);
        StringBuilder readingText = new StringBuilder();
        try {
            while (in.ready()) {
                readingText.append((char) in.read());
            }
         //   return readingText.toString();
        } finally {
            in.close();
        }
        return readingText.toString();
    }
}