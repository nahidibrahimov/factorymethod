package dev.nahidibrahimov.factorymethod;

import dev.nahidibrahimov.factorymethod.factory.DocumentReaderFactory;
import dev.nahidibrahimov.factorymethod.factory.impl.DOCXReaderFactory;
import dev.nahidibrahimov.factorymethod.factory.impl.PDFReaderFactory;
import dev.nahidibrahimov.factorymethod.factory.impl.TXTReaderFactory;

public class Main {
    public static void main(String[] args) {

        String txtpath = "/test/path/document.txt";
        printContent(txtpath, new TXTReaderFactory());

        System.out.println("***********************");

        String pdfPath = "/test/path/document.pdf";
        printContent(pdfPath, new PDFReaderFactory());

        System.out.println("***********************");

        String docxPath = "/test/path/document.docx";
        printContent(docxPath, new DOCXReaderFactory());

    }

    private static void printContent(String path, DocumentReaderFactory factory) {

        DocumentReader reader = factory.createDocumentReader();
        System.out.println(reader.getContent(path));
    }

}