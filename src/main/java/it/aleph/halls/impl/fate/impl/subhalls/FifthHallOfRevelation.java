package it.aleph.halls.impl.fate.impl.subhalls;

import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.Tailor;
import it.aleph.observer.chant.impl.NeverEndingChantOfFate;

import static it.aleph.halls.chant.impl.enums.Note.HEI;

public class FifthHallOfRevelation implements Tailor<NeverEndingChantOfFate> {

    private final static String FIFTH_REVELATION = """
            Nel mondo esistono due sole forze, l'Amore e l'Odio, la Vita e la Morte.
            Chiunque voglia raggiungermi deve usare entrambe poiché L'Amore senza odio è privo di forza,
            e l'Odio privo di amore è cieco e senza direzione...
            Se saprai imbrigliarle, potrai navigare il labirinto e incontrarmi, muovendo ogni cosa
            a tua volontà, poiché Tutto è in Me, ed io sono in Ogni cosa
            """;

    @Override
    public NeverEndingChantOfFate weaveFate() {
        return new NeverEndingChantOfFate().weaveChant(HEI, FIFTH_REVELATION);
    }
}
