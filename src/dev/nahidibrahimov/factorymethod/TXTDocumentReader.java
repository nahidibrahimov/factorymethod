package dev.nahidibrahimov.factorymethod;

public class TXTDocumentReader extends DocumentReader {

    private static TXTDocumentReader documentReader;

    private TXTDocumentReader() {
    }

    public static TXTDocumentReader getInstance() {

        if (documentReader == null) {
            documentReader = new TXTDocumentReader();
        }

        return documentReader;
    }

    @Override
    public String getContent(String documentPath) {
        System.out.println("Reading document: " + documentPath);
        return "This is a text document";
    }
}
