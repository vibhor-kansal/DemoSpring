package com.demospring.processing.parseNexport;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.List;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

@Component
public class CreatePDF {

    public static void main(String[] args) {
        CreatePDF createPDF = new CreatePDF();
        createPDF.exportToPdf();
    }

    private void exportToPdf() {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("HelloWorld.pdf"));

            List list = new List(List.ORDERED);
            Map<String, String> map = new HashMap<>();
            map.put("FirstName","Vibhor");
            map.put("LastName","Kansal");
            map.put("Age", "25");
            Map<String, String> map1 = new HashMap<>();
            map1.put("FirstName","Anvay");
            map1.put("LastName","Rajhansa");
            map1.put("Age", "25");
            list.add(map.toString());
            list.add(map1.toString());

            /*PdfCollection pdfCollection = new PdfCollection(PdfCollection.CUSTOM);
            PdfCollectionSchema pdfCollectionSchema = new PdfCollectionSchema();
            pdfCollectionSchema.addField("FirstName",new PdfCollectionField("dbnfgv", PdfCollectionField.TEXT));
            pdfCollection.setSchema(pdfCollectionSchema);*/

            document.open();
            document.add(list);
            document.close(); // no need to close PDFwriter?

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
