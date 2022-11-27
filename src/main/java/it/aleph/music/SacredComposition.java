package it.aleph.music;

import it.aleph.halls.chant.impl.enums.Note;

import java.util.List;
@FunctionalInterface
public interface SacredComposition {

    SacredComposition compose(Note note, List<Note> counterMelody);
}
