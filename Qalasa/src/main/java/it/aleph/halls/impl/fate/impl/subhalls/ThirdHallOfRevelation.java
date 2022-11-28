package it.aleph.halls.impl.fate.impl.subhalls;

import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.Tailor;
import it.aleph.halls.impl.fate.impl.ThreadHalls;
import it.aleph.music.impl.SacredChant;

import static it.aleph.halls.chant.impl.enums.Note.*;

public class ThirdHallOfRevelation implements Tailor<SacredChant<String, Note>> {

    private final static String THIRD_REVELATION = """
            Samalà Della Corte delle stelle, quel che spetta alle anime
            che hanno abbandonato la loro veste corporea è il Giudizio,
            ...""";




    @Override
    public SacredChant<String, Note> weaveFate() {
        return ThreadHalls.invokeThreadHalls().revealHalls().get(BET).weaveFate().compose(GIMEL, THIRD_REVELATION);
    }
}
