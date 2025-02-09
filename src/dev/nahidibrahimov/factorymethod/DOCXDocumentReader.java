package dev.nahidibrahimov.factorymethod;

public class DOCXDocumentReader extends DocumentReader {

    private String documentPath;

    public DOCXDocumentReader(String documentPath) {
        this.documentPath = documentPath;
    }

    @Override
    public String getContent() {
        System.out.println("Reading document: " + documentPath);
        return "This is a DOCX document";
    }
}
