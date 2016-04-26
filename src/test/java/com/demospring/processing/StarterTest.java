package com.demospring.processing;

import com.demospring.processing.Initializer.AppInitializer;
import org.junit.Before;
import org.junit.Test;

public class StarterTest {

    String filePath;

    AppInitializer appInitializer;

    @Before
    public void setup() {
        filePath = "./files/file1.txt";
    }

    @Test(expected = Exception.class)
    public void TestShowParsedRecords() {
        appInitializer.showParsedRecords();
    }

    @Test
    public void TestShowParsedRecords1() {
        try {
            appInitializer.showParsedRecords();
        } catch (Exception ex) {
        }
    }
}