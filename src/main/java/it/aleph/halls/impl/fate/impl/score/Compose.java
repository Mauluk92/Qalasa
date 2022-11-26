package it.aleph.halls.impl.fate.impl.score;

import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.impl.score.impl.LabyrinthScore;
import it.aleph.spell.AbstractSpell;
import it.aleph.spell.impl.enums.Sigill;
import it.aleph.spell.impl.enums.Verb;

/**
 * As for all things, to compose means to separate and chain, giving order to chaos
 */
public interface Compose {
    ;
    LabyrinthScore rest(Note note, Sigill sigill);
    LabyrinthScore legato(Note note,AbstractSpell first, AbstractSpell second);
    LabyrinthScore staccato(Note note,AbstractSpell first, AbstractSpell second);
    LabyrinthScore bequadro(Note note, AbstractSpell spell);

    LabyrinthScore tune(Sigill sigill, Verb verb);
}
