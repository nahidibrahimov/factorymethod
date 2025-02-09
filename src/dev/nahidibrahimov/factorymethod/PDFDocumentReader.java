package dev.nahidibrahimov.factorymethod;

public class PDFDocumentReader extends DocumentReader {

    private static PDFDocumentReader documentReader;

    private PDFDocumentReader() {
    }

    public static PDFDocumentReader getInstance() {
        if (documentReader == null) {
            documentReader = new PDFDocumentReader();
        }
        return documentReader;
    }

    @Override
    public String getContent(String documentPath) {
        System.out.println("Reading document: " + documentPath);
        return "This is a PDF document";
    }
}
