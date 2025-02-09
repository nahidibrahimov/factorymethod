package dev.nahidibrahimov.factorymethod.factory.impl;

import dev.nahidibrahimov.factorymethod.DocumentReader;
import dev.nahidibrahimov.factorymethod.TXTDocumentReader;
import dev.nahidibrahimov.factorymethod.factory.DocumentReaderFactory;

public class TXTReaderFactory extends DocumentReaderFactory {

    private DocumentReader documentReader;

    @Override
    public DocumentReader createDocumentReader() {

        if (documentReader == null) {
            documentReader = new TXTDocumentReader();
        }

        return documentReader;
    }
}
