package org.example;

public interface ICreateDocument {
    IDocument createNew();

    IDocument createOpen();

    IDocument createSave();
}
