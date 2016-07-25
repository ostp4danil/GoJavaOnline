package com.goit.gojavaonline.module10;

import com.goit.gojavaonline.module09.CaesarsСipher;

import java.io.File;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        CaesarsСipher cipher = new CaesarsСipher("qwerty", 2);
        StreamOerations streamOerations = new StreamOerations("Test");
        File inputFile = new File("example.txt");
        File encodedFile = new File("encoded.txt");
        File decodedFile = new File("decoded.txt");

        try {
            String input1 = streamOerations.readFromFile(inputFile);
            String encoded = cipher.encode(input1);
            System.out.println(encoded);
            streamOerations.writeToFile(encoded, encodedFile);
            System.out.println(inputFile.getName() + " was written into the " + encodedFile.getName());
            String input2 = streamOerations.readFromFile(encodedFile);
            String decoded = cipher.decode(input2);
            streamOerations.writeToFile(decoded, decodedFile);
            System.out.println(encodedFile.getName() + " was written into the " + decodedFile.getName());
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
