package it.aleph.observer.link;

import it.aleph.observer.Observer;

/**
 * Each and everything is connected under the sight of Qalasà, may her name be blessed seven times
 */
public interface Link {

    void attach(Observer observer);
    void propagate();
}
