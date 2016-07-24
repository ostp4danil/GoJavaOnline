package com.goit.gojavaonline.module10;

import com.goit.gojavaonline.module09.CaesarsСipher;

import java.io.File;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        CaesarsСipher cipher = new CaesarsСipher("qwerty", 4);
        StreamOerations streamOerations = new StreamOerations("Test");
        File inputFile = new File("example.txt");
        File encodedFile = new File("encoded.txt");
        File decodedFile = new File("decoded.txt");

        try {
            String string = streamOerations.readFromFile(inputFile);
            String encoded = cipher.encode(string);
            streamOerations.writeToFile(encoded, encodedFile);
            System.out.println(inputFile.getName() + "\'s data was successfully written to "
                    + encodedFile.getName());
        } catch (IOException e) {
            System.err.println(e);
        }

        try {
            encodedFile.delete();
            String string = streamOerations.readFromFile(encodedFile);
            String decoded = cipher.encode(string);
            streamOerations.writeToFile(decoded, decodedFile);

            System.out.println(encodedFile.getName() + "\'s data was successfully written to "
                    + decodedFile.getName());
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
