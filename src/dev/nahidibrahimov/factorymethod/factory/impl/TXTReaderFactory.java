package dev.nahidibrahimov.factorymethod.factory.impl;

import dev.nahidibrahimov.factorymethod.DocumentReader;
import dev.nahidibrahimov.factorymethod.TXTDocumentReader;
import dev.nahidibrahimov.factorymethod.factory.DocumentReaderFactory;

public class TXTReaderFactory extends DocumentReaderFactory {

    @Override
    public DocumentReader createDocumentReader() {
        return TXTDocumentReader.getInstance();
    }
}
