package dev.nahidibrahimov.factorymethod.factory.impl;

import dev.nahidibrahimov.factorymethod.DocumentReader;
import dev.nahidibrahimov.factorymethod.PDFDocumentReader;
import dev.nahidibrahimov.factorymethod.factory.DocumentReaderFactory;

public class PDFReaderFactory extends DocumentReaderFactory {

    private DocumentReader documentReader;

    @Override
    public DocumentReader createDocumentReader() {

        if (documentReader == null) {
            documentReader = new PDFDocumentReader();
        }

        return documentReader;
    }
}
