package com.goit.gojavaonline.module10;


import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamOperations {

    public void writeToFile(final String data, final File file) throws IOException {
        FileWriter out = new FileWriter(file);
        try {
            out.write(data);
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
        } finally {
            in.close();
        }
        return readingText.toString();
    }
}