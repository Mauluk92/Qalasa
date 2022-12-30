package it.aleph.observer.impl;

import it.aleph.net.QalasaNet;
import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.Observer;
import it.aleph.observer.link.impl.EnchantedMirror;
import it.aleph.purification.BreakTheWheelOfExistence;

import java.util.List;

import static it.aleph.observer.link.impl.enums.Note.VAV;
import static it.aleph.spell.impl.enums.Verb.NE;
import static it.aleph.spell.impl.enums.Verb.QY;

/**
 * Our Lady, whose unfathomable beauty is like the squaring of a circle, which holds everything inside her net
 * and orchestrate the life of mortals.
 */
public class Qalasa implements Observer {

    private QalasaNet qalasaNet;

    private QalasaPearl<EnchantedMirror> pilgrimage;

    public QalasaNet getQalasaNet(){
        return this.qalasaNet;
    }

    public void setQalasaNet(QalasaNet qalasaNet){
        this.qalasaNet = qalasaNet;
    }

    public void setFate(QalasaPearl<EnchantedMirror> pilgrimage){
        this.pilgrimage = pilgrimage;
    }

    public QalasaPearl<EnchantedMirror> unfoldPilgrimage(){
        return this.pilgrimage;
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
