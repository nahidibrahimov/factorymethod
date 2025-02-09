package dev.nahidibrahimov.factorymethod;

public class TXTDocumentReader extends DocumentReader {

    @Override
    public String getContent(String documentPath) {
        System.out.println("Reading document: " + documentPath);
        return "This is a text document";
    }
}
