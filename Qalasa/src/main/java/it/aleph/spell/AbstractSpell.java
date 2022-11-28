package it.aleph.spell;

import it.aleph.spell.impl.*;
import it.aleph.spell.impl.enums.Sigill;
import it.aleph.spell.impl.enums.Verb;

import java.util.List;

public abstract class AbstractSpell implements Spell, SpellSpool {

    @Override
    public AbstractSpell legato(Spell spell) {
        return new Legato(List.of(this,spell));
    }

    @Override
    public AbstractSpell staccato(Spell spell) {
        return new Staccato(List.of(this, spell));
    }

    @Override
    public AbstractSpell bequadro() {
        return new Bequadro(this);
    }

    @Override
    public AbstractSpell rest(Sigill sigill, Verb verb) {
        var rest = new Rest();
        rest.endowWord(new Word(verb, sigill));
        return rest;
    }
    @Override
    public AbstractSpell tune(Verb verb, Sigill sigill){
        return new Word(verb, sigill);
    }
}
