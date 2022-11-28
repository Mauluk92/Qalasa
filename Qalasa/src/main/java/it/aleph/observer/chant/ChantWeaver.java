package it.aleph.observer.chant;

import it.aleph.halls.chant.Chant;
import it.aleph.halls.chant.impl.enums.Note;

/**
 * A Chant bind something with a note and commands its existence
 * @param <T>
 */
public interface ChantWeaver<T,B> {


    ChantWeaver<T, B> weaveChant(Note note, T score);

    Chant<B> sing();

    ChantWeaver<T,B> nest();
}
