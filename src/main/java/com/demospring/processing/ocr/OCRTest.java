package com.demospring.processing.ocr;

import com.asprise.ocr.Ocr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.File;
import java.net.URL;

import static com.asprise.ocr.Ocr.LANGUAGE_ENG;

@Component
public class OCRTest {
    private static final Logger LOG = LoggerFactory.getLogger(OCRTest.class);

    public File[] getFileArray(String imagePath) throws Exception {
        URL url = ClassLoader.getSystemResource(imagePath);
        System.out.println(ur);
        File file = new File(url.getFile());
        File[] files = new File[] {file};
        return files;
    }

    public void extractImageData(File[] files) {
        //Ocr.setUp();
        Ocr ocr = new Ocr();
        ocr.startEngine(LANGUAGE_ENG, Ocr.SPEED_SLOW);

        try {
            String s = ocr.recognize(files, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);

            System.out.println("Result : " + s);

            ocr.stopEngine();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
