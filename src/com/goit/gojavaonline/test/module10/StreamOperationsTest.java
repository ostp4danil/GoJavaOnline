package com.goit.gojavaonline.test.module10;

import com.goit.gojavaonline.module10.StreamOperations;
import org.junit.*;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamOperationsTest {

    private FileWriter out;
    private FileReader in;
    private String textData;
    private StringBuilder result;
    private File file;
    private StreamOperations testOperations;

    @Before
    public void setUp() throws Exception {
        file = new File("Test.txt");
        testOperations = new StreamOperations();
        result = new StringBuilder();
        out = new FileWriter(file);
        in = new FileReader(file);
    }

    @After
    public void closeStreamAndRunAssert() throws IOException {
        in.close();
        out.close();
        Assert.assertEquals(textData,result.toString());
    }


    @Test
    public void writeToFileTest() throws Exception {
        textData = "Abcde";
        testOperations.writeToFile(textData, file);
        while (in.ready()) {
            result.append((char) in.read());
        }
    }

    @Test
    public void readFromFileTest() throws Exception {
        textData = "Nevermind";
        out.write(textData);
        out.close();
        result.append(testOperations.readFromFile(file));
    }


}