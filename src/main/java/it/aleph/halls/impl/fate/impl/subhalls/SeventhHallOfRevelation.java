package it.aleph.halls.impl.fate.impl.subhalls;

import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.Tailor;
import it.aleph.observer.chant.impl.NeverEndingChantOfFate;

import static it.aleph.halls.chant.impl.enums.Note.ZAYN;

public class SeventhHallOfRevelation implements Tailor<NeverEndingChantOfFate> {

    private final static String SEVENTH_REVELATION = """
            Preparati ad addentrarti nel labirinto...""";


    @Override
    public NeverEndingChantOfFate weaveFate() {
        return new NeverEndingChantOfFate().weaveChant(ZAYN, SEVENTH_REVELATION);
    }
}
