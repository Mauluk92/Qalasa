package it.aleph.halls.impl.fate.impl.subhalls;

import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.Tailor;
import it.aleph.halls.impl.fate.impl.ThreadHalls;
import it.aleph.music.impl.SacredChant;

import static it.aleph.halls.chant.impl.enums.Note.VAV;
import static it.aleph.halls.chant.impl.enums.Note.ZAYN;

public class SeventhHallOfRevelation implements Tailor<SacredChant<String,Note>> {

    private final static String SEVENTH_REVELATION = """
            Preparati ad addentrarti nel labirinto...""";


    @Override
    public SacredChant<String, Note> weaveFate() {
        return ThreadHalls.invokeThreadHalls().revealHalls().get(VAV).weaveFate().compose(ZAYN, SEVENTH_REVELATION);
    }
}
