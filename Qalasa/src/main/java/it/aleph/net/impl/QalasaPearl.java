package it.aleph.net.impl;

import it.aleph.net.Monad;
import it.aleph.observer.link.Link;
import it.aleph.spell.impl.enums.Verb;

import static it.aleph.spell.impl.enums.Verb.NE;

/**
 * Everything lives inside a pearl of Qalasà, may her name be blessed seven times,
 * which reflects all other pearls.
 * @param <T>
 */
public class QalasaPearl<T extends Link<? extends Enum<?>>> extends Monad<T> {
    private Verb qalasaWord;
    @Override
    public void endowEssence(T essence) {
        super.endowEssence(essence);
    }


    public void speakVerb(Verb verb){
        this.qalasaWord = verb;
    }

    public Verb revealVerb(){
        return qalasaWord;
    }

    @Override
    public String toString() {
        var light = " è circonfusa da luce";
        var darkness = " è avvolta dalle tenebre";
        return "La sala " + getEssence() + (qalasaWord == NE ? light : darkness);

    }
}
