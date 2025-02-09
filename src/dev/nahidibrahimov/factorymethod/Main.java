package dev.nahidibrahimov.factorymethod;

import dev.nahidibrahimov.factorymethod.factory.DocumentReaderFactory;
import dev.nahidibrahimov.factorymethod.factory.impl.DOCXReaderFactory;
import dev.nahidibrahimov.factorymethod.factory.impl.PDFReaderFactory;
import dev.nahidibrahimov.factorymethod.factory.impl.TXTReaderFactory;

public class Main {
    public static void main(String[] args) {

        String docPath = "/test/path/document.txt";
        printContent(docPath, new TXTReaderFactory());

//        String docPath = "/test/path/document.pdf";
//        printContent(docPath, new PDFReaderFactory());
//
//        String docPath = "/test/path/document.docx";
//        printContent(docPath, new DOCXReaderFactory());

    }

    private static void printContent(String path, DocumentReaderFactory factory) {

        DocumentReader reader = factory.createDocumentReader(path);
        System.out.println(reader.getContent());
    }

}