package org.example;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {

        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {

        return new TextDocument();
    }

    @Override
    public IDocument createSave() {
        return new TextDocument();
    }
}
