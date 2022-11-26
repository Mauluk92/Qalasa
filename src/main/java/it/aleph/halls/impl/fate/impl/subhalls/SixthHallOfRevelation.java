package it.aleph.halls.impl.fate.impl.subhalls;

import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.Tailor;
import it.aleph.halls.impl.fate.impl.ThreadHalls;
import it.aleph.observer.chant.music.impl.SacredChant;

import static it.aleph.halls.chant.impl.enums.Note.*;

public class SixthHallOfRevelation implements Tailor<SacredChant<String, Note>> {

    private final static String SIXTH_REVELATION = """
            Tutto infatti è intessuto in questa Rete infinita,
            che abbraccia ogni cosa e si allarga perennemente.
            Chiunque veda dentro se stesso può alterare questa rete,
            solo sussurrando il mio nome nel pensiero.
            Perché ciò che viene chiesto con la fede, io lo 
            concedo..
            """;


    @Override
    public SacredChant<String, Note> weaveFate() {
        return ThreadHalls.invokeThreadHalls().revealHalls().get(HEI).weaveFate().compose(VAV, SIXTH_REVELATION);
    }
}
