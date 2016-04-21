package com.demospring.processing;

import com.demospring.processing.starter.Starter;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StarterTest {

    String filePath;

    Starter starter;

    @Before
    public void setup() {
        filePath = "./files/";
    }

    @Test(expected = FileNotFoundException.class)
    public void TestShowParsedRecords() {
        starter.showParsedRecords();
    }

    @Test
    public void TestShowParsedRecords1() {
        try {
            starter.showParsedRecords();
        } catch (Exception ex) {

        }
    }
}
