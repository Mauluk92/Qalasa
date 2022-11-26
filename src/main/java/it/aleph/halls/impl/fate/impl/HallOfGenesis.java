package it.aleph.halls.impl.fate.impl;

import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.Tailor;
import it.aleph.halls.impl.fate.impl.score.impl.LabyrinthScore;
import it.aleph.spell.AbstractSpell;

import java.util.Map;

import static it.aleph.halls.chant.impl.enums.Note.*;
import static it.aleph.spell.impl.enums.Sigill.A;
import static it.aleph.spell.impl.enums.Sigill.B;
import static it.aleph.spell.impl.enums.Verb.NE;
import static it.aleph.spell.impl.enums.Verb.QY;

/**
 * Spells and notes are the building blocks of reality. Everything is built singing spells with the appropriate note
 */
public class HallOfGenesis implements Tailor<Map<Note,AbstractSpell>> {


    private static HallOfGenesis HALL_OF_GENESIS;


    private HallOfGenesis(){}
    @Override
    public Map<Note,AbstractSpell> weaveFate() {
        return songOfQalasa();
    }

    private Map<Note, AbstractSpell> songOfQalasa(){
        var score = new LabyrinthScore();
        return score
                .tune(A,NE)
                .rest(ALEPH, A)
                .bequadro(BET,score.revealNote(A))
                .tune(B, QY)
                .rest(GIMEL, B)
                .rest(DALED, A)
                .legato(HEI,
                        score.revealNote(A),
                        score.revealNote(B))
                .legato(VAV,
                        score.revealNote(A),
                        score.revealNote(B)
                                .bequadro())
                .rest(ZAYN, B)
                .compose();
    }

    public static HallOfGenesis invokeHallOfGenesis(){
        if(HALL_OF_GENESIS == null){
            HALL_OF_GENESIS = new HallOfGenesis();
        }
        return HALL_OF_GENESIS;
    }
}
