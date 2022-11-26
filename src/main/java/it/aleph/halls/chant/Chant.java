package it.aleph.halls.chant;

import it.aleph.halls.chant.impl.enums.Note;

/**
 * Nothing exists without music, because music gives order to the cacophony of Many Voice
 * @param <T>
 */
public interface Chant<T> {

    void tune(T scoreOfFate);
    void sing(T scoreOfFate);

    void compose(Chant<T> composition);


}
