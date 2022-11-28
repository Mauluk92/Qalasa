package it.aleph.halls.chant;

/**
 * Nothing exists without music, because music gives order to the cacophony of Many Voice
 * @param <T>
 */
public interface Chant<T> {

    void tune(T scoreOfFate);
    void sing(T scoreOfFate);

    void compose(Chant<T> composition);


}
