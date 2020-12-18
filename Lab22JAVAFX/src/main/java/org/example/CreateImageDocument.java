package org.example;

public class CreateImageDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new ImageDocument();
    }

    @Override
    public IDocument createOpen() {
        return new ImageDocument();
    }

    @Override
    public IDocument createSave() {
        return new ImageDocument();
    }
}
