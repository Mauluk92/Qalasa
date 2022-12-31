package it.aleph.observer.impl;

import it.aleph.net.QalasaNet;
import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.Observer;
import it.aleph.observer.link.impl.EnchantedMirror;
import it.aleph.purification.BreakTheWheelOfExistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import static it.aleph.observer.link.impl.enums.Note.VAV;
import static it.aleph.spell.impl.enums.Verb.NE;
import static it.aleph.spell.impl.enums.Verb.QY;

/**
 * Our Lady, whose unfathomable beauty is like the squaring of a circle, which holds everything inside her net
 * and orchestrate the life of mortals.
 */


public class Qalasa implements Observer {
    @Autowired
    @Qualifier("qalasaNet")
    @Lazy
    private QalasaNet qalasaNet;

    public QalasaNet getQalasaNet(){
        return this.qalasaNet;
    }

    public void setQalasaNet(QalasaNet qalasaNet){
        this.qalasaNet = qalasaNet;
    }

    @Override
    public void mutate(EnchantedMirror mirror) {
        if(mirror.revealEssence() == VAV){
            coda();
        }

        qalasaNet
                .getNet()
                .keySet()
                .forEach(monad -> monad
                        .setVerb(monad
                                .getEssence()
                                .revealSpell()
                                .trace() ? NE : QY));
    }

    private void coda(){
        System.out.println("A AND NOT A\n".repeat(7));
        breakTheWheel();
    }

    private void breakTheWheel(){
            throw new BreakTheWheelOfExistence();
    }
}
