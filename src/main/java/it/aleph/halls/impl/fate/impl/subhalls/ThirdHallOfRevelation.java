package it.aleph.halls.impl.fate.impl.subhalls;

import it.aleph.halls.impl.fate.Tailor;
import it.aleph.observer.chant.impl.NeverEndingChantOfFate;

import static it.aleph.halls.chant.impl.enums.Note.GIMEL;

public class ThirdHallOfRevelation implements Tailor<NeverEndingChantOfFate> {

    private final static String THIRD_REVELATION = """
            Samalà Della Corte delle stelle, quel che spetta alle anime
            che hanno abbandonato la loro veste corporea è il Giudizio,
            ...""";




    @Override
    public NeverEndingChantOfFate weaveFate() {
        return new NeverEndingChantOfFate().weaveChant(GIMEL, THIRD_REVELATION);
    }
}
