package it.aleph.halls.impl.fate.impl.subhalls;

import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.Tailor;
import it.aleph.observer.chant.impl.NeverEndingChantOfFate;

import static it.aleph.halls.chant.impl.enums.Note.DALED;

public class FourthHallOfRevelation implements Tailor<NeverEndingChantOfFate> {


    private final static String FOURTH_REVELATION = """
            Dovrai vagare per le mie sale per incontrarmi. Se non riuscirai,
            la pena sarà vagare di nuovo affinché tu sia purificato dalle pene passate.
            Le mie sale sono specchi che riflettono l'animo di chi le osserva
            """;

    @Override
    public NeverEndingChantOfFate weaveFate() {
        return new NeverEndingChantOfFate().weaveChant(DALED, FOURTH_REVELATION);
    }
}
