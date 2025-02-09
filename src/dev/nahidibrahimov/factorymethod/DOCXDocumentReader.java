package dev.nahidibrahimov.factorymethod;

public class DOCXDocumentReader extends DocumentReader {

    @Override
    public String getContent(String documentPath) {
        System.out.println("Reading document: " + documentPath);
        return "This is a DOCX document";
    }
}
