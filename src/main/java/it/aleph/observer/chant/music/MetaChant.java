package it.aleph.observer.chant.music;

import it.aleph.halls.chant.impl.enums.Note;

@FunctionalInterface
public interface MetaChant<T, B> {

    MetaChant<T, B> compose(Note note, T score);

}
