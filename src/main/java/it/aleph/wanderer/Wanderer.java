package it.aleph.wanderer;

import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.link.Link;

/** This spell makes it possible for the wizard to navigate through different worlds and planes of existence,
 * while keeping always a sense of direction. In a sense, it's like a compass.
 */
public interface Wanderer<T extends Link> {

    void wander(QalasaPearl<T> qalasaPearl);

    void wander(T nodeOfExistence);
}
