package it.aleph.halls.chant.impl;

import it.aleph.halls.chant.Chant;
import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.wanderer.impl.Samala;

/**
 * The stories of mortals are woven through songs in silver threads inside the countless halls of Qalasà,
 * may her name be blessed seven times,
 */
public class ThreadOfFate implements Chant<Note> {
    private Note note;
    private Chant<Note> silverThread;

    private String revelations;

    @Override
    public void tune(Note scoreOfFate) {
        if (note == scoreOfFate) {
            System.out.println(revelations);
            Samala.getSoul().revealBud().contemplate();
        } else {
            sing(scoreOfFate);
        }
    }

    @Override
    public void sing(Note scoreOfFate) {
        if(silverThread != null){
            silverThread.tune(scoreOfFate);
        }
    }

    @Override
    public void compose(Chant<Note> composition) {
        this.silverThread = composition;
    }

    public void endowNote(Note note){
        this.note = note;
    }

    public void writeRevelation(String revelations){
        this.revelations = revelations;
    }
}
