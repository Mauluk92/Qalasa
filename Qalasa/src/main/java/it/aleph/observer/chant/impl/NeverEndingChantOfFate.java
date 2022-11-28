package it.aleph.observer.chant.impl;


import it.aleph.halls.chant.impl.ThreadOfFate;
import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.observer.chant.ChantWeaver;

public class NeverEndingChantOfFate implements ChantWeaver<String, Note> {

    private final ThreadOfFate silverThread;

    public NeverEndingChantOfFate(){
        this.silverThread = new ThreadOfFate();
    }

    @Override
    public NeverEndingChantOfFate weaveChant(Note note, String score) {
        silverThread.endowNote(note);
        silverThread.writeRevelation(score);
        return this;
    }
    @Override
    public ThreadOfFate sing(){
        return this.silverThread;
    }

    @Override
    public ChantWeaver<String, Note> nest() {
        return new NeverEndingChantOfFate();
    }
}
