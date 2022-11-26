package it.aleph.halls.impl.fate.impl.subhalls;

import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.Tailor;
import it.aleph.halls.impl.fate.impl.ThreadHalls;
import it.aleph.observer.chant.impl.NeverEndingChantOfFate;
import it.aleph.observer.chant.music.impl.SacredChant;

import static it.aleph.halls.chant.impl.enums.Note.*;

public class FourthHallOfRevelation implements Tailor<SacredChant<String, Note>> {


    private final static String FOURTH_REVELATION = """
            Dovrai vagare per le mie sale per incontrarmi. Se non riuscirai,
            la pena sarà vagare di nuovo affinché tu sia purificato dalle pene passate.
            Le mie sale sono specchi che riflettono l'animo di chi le osserva
            """;

    @Override
    public SacredChant<String,Note> weaveFate() {
        return ThreadHalls.invokeThreadHalls().revealHalls().get(GIMEL).weaveFate().compose(DALED, FOURTH_REVELATION);
    }
}
