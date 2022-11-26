package it.aleph.observer.link.impl;


import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.observer.Observer;
import it.aleph.observer.link.Link;
import it.aleph.spell.Spell;

/**
 * The mirrors of the halls of judgment reflects the soul of those who wander inside the halls of Qalasà,
 * may her name be blessed
 */
public class EnchantedMirror implements Link {
    Observer qalasaSight;
    private Spell enchantment;

    private final Note note;

    public EnchantedMirror(Note note){
        this.note = note;
    }
    public Spell revealSpell() {
        return enchantment;
    }
    public void enchantMirror(Spell spell) {
        this.enchantment = spell;
    }
    public Note sing(){
        return this.note;
    }
    @Override
    public void attach(Observer observer) {
        this.qalasaSight = observer;
    }

    @Override
    public void propagate() {
        qalasaSight.mutate(this);
    }

    @Override
    public String toString() {
        return note.toString();
    }
}
