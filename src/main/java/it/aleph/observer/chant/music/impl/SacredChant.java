package it.aleph.observer.chant.music.impl;

import it.aleph.halls.chant.Chant;
import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.Halls;
import it.aleph.observer.chant.music.MetaChant;
import it.aleph.observer.chant.ChantWeaver;

import java.util.ArrayList;
import java.util.List;

public class SacredChant<T,B> extends Halls<Chant<B>> implements MetaChant<T,B> {

    private final List<ChantWeaver<T,B>> metaChant;

    private final ChantWeaver<T,B> chantWeaver;

    public SacredChant(ChantWeaver<T,B> chantWeaver){
        this.metaChant = new ArrayList<>();
        this.chantWeaver = chantWeaver;
    }

    @Override
    public SacredChant<T, B> compose(Note note, T score) {
        var song = chantWeaver.nest();
        song.weaveChant(note, score);
        metaChant.add(song);
        return this;
    }

    public Chant<B> reveal(){
        return recursiveChant(metaChant.stream().map(ChantWeaver::sing).toList(), Chant::compose);
    }
}
