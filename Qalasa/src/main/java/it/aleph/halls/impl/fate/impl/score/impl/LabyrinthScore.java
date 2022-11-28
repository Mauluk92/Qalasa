package it.aleph.halls.impl.fate.impl.score.impl;

import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.impl.score.Compose;
import it.aleph.spell.AbstractSpell;
import it.aleph.spell.impl.Rest;
import it.aleph.spell.impl.Word;
import it.aleph.spell.impl.enums.Sigill;
import it.aleph.spell.impl.enums.Verb;

import java.util.HashMap;
import java.util.Map;

/**
 * The same Judgment we incur once dead, is itself a perfectly orchestrated music woven by the sweet voice of Qalasà,
 * may her name be blessed seven times
 */
public class LabyrinthScore implements Compose {

    private final Map<Note, AbstractSpell> score = new HashMap<>();
    private final Map<Sigill, Word> elements = new HashMap<>();

    @Override
    public LabyrinthScore rest(Note note,Sigill sigill) {
        var rest = new Rest();
        rest.endowWord(this.elements.get(sigill));
        this.score.put(note, rest);
        return this;
    }

    @Override
    public LabyrinthScore legato(Note note, AbstractSpell first, AbstractSpell second) {
        this.score.put(note, first.legato(second));
        return this;
    }

    @Override
    public LabyrinthScore staccato(Note note, AbstractSpell first, AbstractSpell second) {
        this.score.put(note, first.staccato(second));
        return this;
    }

    @Override
    public LabyrinthScore bequadro(Note note, AbstractSpell spell) {
        this.score.put(note, spell.bequadro());
        return this;
    }

    @Override
    public LabyrinthScore tune(Sigill sigill, Verb verb) {
        this.elements.put(sigill, new Word(verb, sigill));
        return this;
    }

    public Word revealNote(Sigill sigill){
        return this.elements.get(sigill);
    }

    public Map<Note, AbstractSpell> compose(){
        return this.score;
    }
}