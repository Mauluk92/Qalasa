package it.aleph.spell;

public abstract class SimpleSpell extends AbstractSpell {

    private final Spell spell;

    public SimpleSpell(Spell spell){
        this.spell = spell;
    }

    public Spell getSpell() {
        return spell;
    }
}
