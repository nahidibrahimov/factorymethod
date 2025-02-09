package dev.nahidibrahimov.factorymethod.factory.impl;

import dev.nahidibrahimov.factorymethod.DOCXDocumentReader;
import dev.nahidibrahimov.factorymethod.DocumentReader;
import dev.nahidibrahimov.factorymethod.factory.DocumentReaderFactory;

public class DOCXReaderFactory extends DocumentReaderFactory {

    @Override
    public DocumentReader createDocumentReader() {
        return DOCXDocumentReader.getInstance();
    }
}
