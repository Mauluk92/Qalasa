package it.aleph.observer.link.impl;



import it.aleph.observer.Observer;
import it.aleph.observer.link.Link;
import it.aleph.observer.link.impl.enums.Note;
import it.aleph.spell.Spell;

/**
 * The mirrors of the halls of judgment reflects the soul of those who wander inside the halls of Qalasà,
 * may her name be blessed
 */
public class EnchantedMirror implements Link<Note> {
    private Observer qalasaSight;
    private Spell essence;
    private Note note;
    public Note revealEssence() { return this.note;}

    public Spell revealSpell() {return this.essence;}

    public void setEssence(Spell spell) { this.essence = spell;}

    public void setQalasaSight(Observer observer){
        this.qalasaSight = observer;
    }

    public void setNote(Note note){
        this.note = note;
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
