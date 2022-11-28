package it.aleph.observer.chant.impl;

import it.aleph.halls.chant.impl.NeverEndingChantOfQalasa;
import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.chant.ChantWeaver;
import it.aleph.observer.link.impl.EnchantedMirror;

import java.util.List;

public class NeverEndingChantOfGenesis implements ChantWeaver<List<Note>, QalasaPearl<EnchantedMirror>> {

    private final NeverEndingChantOfQalasa neverEndingSong;


    public NeverEndingChantOfGenesis(){
        this.neverEndingSong = new NeverEndingChantOfQalasa();
    }
    @Override
    public NeverEndingChantOfGenesis weaveChant(Note note, List<Note> weavingChant) {
        neverEndingSong.tuneWeavingSong(weavingChant);
        neverEndingSong.endowNote(note);
        return this;
    }
    @Override
    public NeverEndingChantOfQalasa sing(){
        return this.neverEndingSong;
    }

    @Override
    public ChantWeaver<List<Note>, QalasaPearl<EnchantedMirror>> nest() {
        return new NeverEndingChantOfGenesis();
    }
}
