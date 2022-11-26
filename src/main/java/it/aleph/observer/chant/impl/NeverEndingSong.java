package it.aleph.observer.chant.impl;

import it.aleph.halls.chant.impl.ChantOfTheHalls;
import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.observer.chant.ChantWeaver;
import it.aleph.observer.link.impl.EnchantedMirror;
import it.aleph.observer.link.impl.essence.Essence;
import it.aleph.spell.Spell;

public class NeverEndingSong implements ChantWeaver<Spell, EnchantedMirror> {

    private ChantOfTheHalls neverEndingSong;


    @Override
    public NeverEndingSong weaveChant(Note note, Spell spell) {
        var chant = new ChantOfTheHalls();
        var essence = new Essence(spell, note);
        chant.endowEssence(essence);
        this.neverEndingSong = chant;
        return this;

    }
    @Override
    public ChantOfTheHalls sing(){
        return this.neverEndingSong;
    }

    @Override
    public ChantWeaver<Spell, EnchantedMirror> nest() {
        return new NeverEndingSong();
    }
}
