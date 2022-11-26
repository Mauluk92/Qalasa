package it.aleph.spell.impl;

import it.aleph.spell.CompositeSpell;
import it.aleph.spell.Spell;

import java.util.List;
import java.util.stream.Collectors;

public class Staccato extends CompositeSpell {


    public Staccato(List<Spell> spells) {
        super(spells);
    }

    @Override
    public Boolean trace() {
        return this.getSpells()
                .stream()
                .map(Spell::trace)
                .reduce(Boolean::logicalOr)
                .orElse(false);
    }

    @Override
    public String toString() {
        return "(" +
                super.getSpells()
                        .stream()
                        .map(Spell::toString)
                        .collect(Collectors.joining(" OR ")) +
                ")";

    }
}
