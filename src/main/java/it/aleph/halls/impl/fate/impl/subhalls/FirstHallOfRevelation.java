package it.aleph.halls.impl.fate.impl.subhalls;

import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.Tailor;
import it.aleph.observer.chant.impl.NeverEndingChantOfFate;
import it.aleph.observer.chant.music.impl.SacredChant;

import static it.aleph.halls.chant.impl.enums.Note.ALEPH;

public class FirstHallOfRevelation implements Tailor<SacredChant<String, Note>> {

    private final static String FIRST_REVELATION = """
            Samalà della corte delle stelle, la tua rosa ha rintoccato l'ultima nota..
            Io sono Qalasà, la Signora dei mondi, ho fabbricato questa realtà dal nulla del caos..
            """;

    @Override
    public SacredChant<String,Note> weaveFate() {
        return new SacredChant<>(new NeverEndingChantOfFate()).compose(ALEPH, FIRST_REVELATION);
    }
}
