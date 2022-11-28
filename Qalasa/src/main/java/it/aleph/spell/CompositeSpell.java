package it.aleph.spell;

import java.util.List;

public abstract class CompositeSpell extends AbstractSpell {

    private final  List<Spell> spells;

    public CompositeSpell(List<Spell> spells){
        this.spells = spells;
    }

    public List<Spell> getSpells() {
        return spells;
    }
}
