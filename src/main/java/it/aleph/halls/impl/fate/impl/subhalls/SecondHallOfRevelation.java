package it.aleph.halls.impl.fate.impl.subhalls;


import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.Tailor;
import it.aleph.halls.impl.fate.impl.ThreadHalls;
import it.aleph.observer.chant.impl.NeverEndingChantOfFate;
import it.aleph.observer.chant.music.impl.SacredChant;

import static it.aleph.halls.chant.impl.enums.Note.ALEPH;
import static it.aleph.halls.chant.impl.enums.Note.BET;

public class SecondHallOfRevelation implements Tailor<SacredChant<String,Note>> {

    private final static String SECOND_REVELATION = """
            In principio era solo il caos ruggente di Millevoci dell'Abisso.
            Una cacofonia priva di senso e ordine, il vorticare ignoto
            degli elementi.
            Ma con il mio Canto ho domato il mare in tempesta del Vuoto.
            Dando forma al senza-forma...
            """;

    @Override
    public SacredChant<String, Note> weaveFate() {
        return ThreadHalls.invokeThreadHalls().revealHalls().get(ALEPH).weaveFate().compose(BET, SECOND_REVELATION);
    }
}
