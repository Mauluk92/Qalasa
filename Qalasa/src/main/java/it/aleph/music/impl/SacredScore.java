package it.aleph.music.impl;

import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.music.SacredComposition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * It is told that the fate of mortals is written in scores, whose music is their life
 */
public class SacredScore implements SacredComposition {

    private final Map<Note, List<Note>> score = new HashMap<>();

    @Override
    public SacredScore compose(Note note, List<Note> counterMelody) {
        score.putIfAbsent(note, counterMelody);
        return this;
    }

    public Map<Note, List<Note>> revealSacredScore(){
        return this.score;
    }
}
