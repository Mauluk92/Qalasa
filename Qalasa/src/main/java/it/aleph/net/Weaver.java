package it.aleph.net;


import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.link.Link;

public interface Weaver<T extends Link<?>> {

    Weaver<T> weave(QalasaPearl<T> qalasaPearl);

    Weaver<T> weave(QalasaPearl<T> qalasaPearl, QalasaPearl<T> connectedPearl);
}
