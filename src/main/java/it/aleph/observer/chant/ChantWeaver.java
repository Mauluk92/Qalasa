package it.aleph.observer.chant;

import it.aleph.halls.chant.impl.enums.Note;

/**
 * A Chant bind something with a note and commands its existence
 * @param <T>
 */
public interface ChantWeaver<T> {


    ChantWeaver<T> weaveChant(Note note, T score);
}
