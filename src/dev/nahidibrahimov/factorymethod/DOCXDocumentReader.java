package dev.nahidibrahimov.factorymethod;

public class DOCXDocumentReader extends DocumentReader {

    private static DOCXDocumentReader documentReader;

    private DOCXDocumentReader() {
    }

    public static DOCXDocumentReader getInstance() {
        if (documentReader == null) {
            documentReader = new DOCXDocumentReader();
        }
        return documentReader;
    }

    @Override
    public String getContent(String documentPath) {
        System.out.println("Reading document: " + documentPath);
        return "This is a DOCX document";
    }
}
