package com.demospring.processing.ocr;

import com.asprise.ocr.Ocr;

import java.io.File;
import java.net.URL;

public class OCRTest {

    public static final String IMAGE_PATH = "./images/images1.jpg";

    public static File[] getFileArray() {
        URL url = ClassLoader.getSystemResource(IMAGE_PATH);

        File file = new File(url.getFile());
        File[] files = new File[] {file};
        return files;
    }

    public static void main(String[] args) {

        OCRTest ocrTest = new OCRTest();

        //Ocr.setUp();
        Ocr ocr = new Ocr();
        ocr.startEngine("eng", Ocr.SPEED_SLOW);
        String s = ocr.recognize("/home/webonise/Core_Projects/mypic.jpeg", -1, 0, 0, 1500, 1500, Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
        //String s = ocr.recognize(ocrTest.getFileArray(), Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);

        System.out.println("Result : " + s);

        ocr.stopEngine();
    }
}