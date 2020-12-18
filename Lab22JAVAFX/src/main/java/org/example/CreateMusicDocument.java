package org.example;

public class CreateMusicDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new MusicDocument();
    }

    @Override
    public IDocument createOpen() {
        return new MusicDocument();
    }

    @Override
    public IDocument createSave() {
        return new MusicDocument();
    }
}
