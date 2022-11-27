package it.aleph.halls.chant.impl;

import it.aleph.halls.chant.Chant;
import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.impl.Qalasa;
import it.aleph.observer.link.impl.EnchantedMirror;

import java.util.List;

/**
 * The net of Qalasà, may her name be blessed seven times, is sung eternally through Her voice
 */
public class NeverEndingChantOfQalasa implements Chant<QalasaPearl<EnchantedMirror>> {

    private Chant<QalasaPearl<EnchantedMirror>> song;
    private List<Note> counterMelody;
    private Note note;

    @Override
    public void tune(QalasaPearl<EnchantedMirror> scoreOfFate) {
        if(note == scoreOfFate.getEssence().revealEssence()){
           Qalasa.invokeQalasa()
                   .unfoldNet()
                   .getNet()
                   .keySet()
                   .stream()
                   .filter((qalasaPearl -> counterMelody
                           .contains(qalasaPearl
                                   .getEssence()
                                   .revealEssence()
                                   )))
                   .forEach((qalasaPearl -> Qalasa
                           .invokeQalasa()
                           .unfoldNet()
                           .weave(scoreOfFate, qalasaPearl)));
        }else{
            sing(scoreOfFate);
        }
    }

    @Override
    public void sing(QalasaPearl<EnchantedMirror> scoreOfFate) {
        if(this.song != null) {
            song.tune(scoreOfFate);
        }
    }
    @Override
    public void compose(Chant<QalasaPearl<EnchantedMirror>> chant){
        this.song = chant;
    }

    public void endowNote(Note note){
        this.note = note;
    }

    public void tuneWeavingSong(List<Note> counterMelody) {
        this.counterMelody = counterMelody;
    }
}
