package dev.nahidibrahimov.factorymethod.factory;

import dev.nahidibrahimov.factorymethod.DocumentReader;

public abstract class DocumentReaderFactory {

    public abstract DocumentReader createDocumentReader(String path);

}
