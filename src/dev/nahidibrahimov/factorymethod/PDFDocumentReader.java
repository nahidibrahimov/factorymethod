package dev.nahidibrahimov.factorymethod;

public class PDFDocumentReader extends DocumentReader {

    @Override
    public String getContent(String documentPath) {
        System.out.println("Reading document: " + documentPath);
        return "This is a PDF document";
    }
}
