package it.aleph.observer.impl;

import it.aleph.purification.BreakTheWheelOfExistence;
import it.aleph.net.QalasaNet;
import it.aleph.observer.Observer;
import it.aleph.observer.link.impl.EnchantedMirror;
import it.aleph.wanderer.impl.Samala;

import static it.aleph.halls.chant.impl.enums.Note.VAV;
import static it.aleph.spell.impl.enums.Verb.NE;
import static it.aleph.spell.impl.enums.Verb.QY;
import static it.aleph.wanderer.impl.enums.SoulState.PURIFIED_STATE;

/**
 * Our Lady, whose unfathomable beauty is like the squaring of a circle, which holds everything inside her net
 * and orchestrate the life of mortals.
 */
public class Qalasa implements Observer {

    private static Qalasa QALASA;

    private final QalasaNet qalasaNet;

    private Qalasa(){
        this.qalasaNet = new QalasaNet();
    }

    @Override
    public void mutate(EnchantedMirror mirror) {
        if(mirror.sing() == VAV){
            coda();
        }

        qalasaNet
                .getNet()
                .keySet()
                .forEach(monad -> monad
                        .speakVerb(monad
                                .getEssence()
                                .revealSpell()
                                .trace() ? NE : QY));
    }

    public QalasaNet unfoldNet(){
        return this.qalasaNet;
    }

    public static Qalasa invokeQalasa(){
        if(QALASA == null){
            QALASA = new Qalasa();
        }
        return QALASA;

    }

    private void coda(){
        Samala.getSoul().purify();
        System.out.println("A AND NOT A\n".repeat(7));
        breakTheWheel();
    }

    private void breakTheWheel(){
        if(Samala.getSoul().judge() == PURIFIED_STATE){
            throw new BreakTheWheelOfExistence();
        }
    }
}
