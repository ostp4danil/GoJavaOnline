package com.goit.gojavaonline.module10;

import com.goit.gojavaonline.module09.CaesarsСipher;

import java.io.File;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        CaesarsСipher cipher = new CaesarsСipher("qwerty", 2);
        StreamOperations streamOerations = new StreamOperations("Test");

        File inputFile = new File("example.txt");
        File encodedFile = new File("encoded1.txt");
        File decodedFile = new File("decoded1.txt");

        try {
            String input1 = streamOerations.readFromFile(inputFile);
            String encoded = cipher.encode(input1);
            streamOerations.writeToFile(encoded, encodedFile);
            System.out.println(inputFile.getName() + " was written into the " + encodedFile.getName());

            String input2 = streamOerations.readFromFile(encodedFile);
            String decoded = cipher.decode(input2);
            streamOerations.writeToFile(decoded, decodedFile);
            System.out.println(encodedFile.getName() + " was written into the " + decodedFile.getName());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
