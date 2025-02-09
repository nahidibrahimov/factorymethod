package dev.nahidibrahimov.factorymethod;

public class PDFDocumentReader extends DocumentReader {

    private String documentPath;

    public PDFDocumentReader(String documentPath) {
        this.documentPath = documentPath;
    }

    @Override
    public String getContent() {
        System.out.println("Reading document: " + documentPath);
        return "This is a PDF document";
    }
}
