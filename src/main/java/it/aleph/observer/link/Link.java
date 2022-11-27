package it.aleph.observer.link;

import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.observer.Observer;
import it.aleph.spell.Spell;

import java.util.Enumeration;

/**
 * Each and everything is connected under the sight of Qalasà, may her name be blessed seven times
 */
public interface Link<N extends Enum<?>> {

    void attach(Observer observer, N note);
    void propagate();
}
