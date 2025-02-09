package dev.nahidibrahimov.factorymethod.factory.impl;

import dev.nahidibrahimov.factorymethod.DOCXDocumentReader;
import dev.nahidibrahimov.factorymethod.DocumentReader;
import dev.nahidibrahimov.factorymethod.factory.DocumentReaderFactory;

public class DOCXReaderFactory extends DocumentReaderFactory {

    private DocumentReader documentReader;

    @Override
    public DocumentReader createDocumentReader() {

        if (documentReader == null) {
            documentReader = new DOCXDocumentReader();
        }

        return documentReader;
    }
}
