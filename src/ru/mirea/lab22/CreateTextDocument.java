package ru.mirea.lab22;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        return new TextDocument();
    }
}