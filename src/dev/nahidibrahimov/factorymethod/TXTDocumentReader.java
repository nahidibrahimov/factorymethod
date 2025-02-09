package dev.nahidibrahimov.factorymethod;

public class TXTDocumentReader extends DocumentReader {

    private String documentPath;

    public TXTDocumentReader(String documentPath) {
        this.documentPath = documentPath;
    }

    @Override
    public String getContent() {
        System.out.println("Reading document: " + documentPath);
        return "This is a text document";
    }
}
