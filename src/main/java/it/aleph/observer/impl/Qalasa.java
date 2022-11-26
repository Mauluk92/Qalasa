package it.aleph.observer.impl;

import it.aleph.halls.chant.Chant;
import it.aleph.halls.chant.impl.ChantOfTheHalls;
import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.net.QalasaNet;
import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.Observer;
import it.aleph.observer.chant.impl.NeverEndingChantOfFate;
import it.aleph.observer.chant.impl.NeverEndingChantOfGenesis;
import it.aleph.observer.chant.impl.NeverEndingSong;
import it.aleph.observer.chant.music.impl.SacredChant;
import it.aleph.observer.link.impl.EnchantedMirror;
import it.aleph.purification.BreakTheWheelOfExistence;
import it.aleph.spell.Spell;
import it.aleph.wanderer.impl.Samala;

import java.util.List;

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


    private final SacredChant<List<QalasaPearl<EnchantedMirror>>, QalasaPearl<EnchantedMirror>> sacredChantOfGenesis;
    private final SacredChant<Spell, EnchantedMirror> sacredNeverEndingChant;

    private Qalasa(){

        this.sacredChantOfGenesis = new SacredChant<>(new NeverEndingChantOfGenesis());
        this.sacredNeverEndingChant = new SacredChant<>(new NeverEndingSong());
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
