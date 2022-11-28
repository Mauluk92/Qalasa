package it.aleph.spell.impl;

import it.aleph.spell.SimpleSpell;
import it.aleph.spell.Spell;

public class Bequadro extends SimpleSpell {

    public Bequadro(Spell spell){
        super(spell);
    }

    @Override
    public Boolean trace() {
        return !getSpell().trace();
    }

    @Override
    public String toString() {
        return "NOT (" + super.getSpell().toString() + ")";
    }
}
