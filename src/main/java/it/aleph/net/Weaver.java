package it.aleph.net;


import it.aleph.halls.chant.Chant;
import it.aleph.halls.chant.impl.NeverEndingChantOfQalasa;
import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.link.Link;
import it.aleph.observer.link.impl.EnchantedMirror;

public interface Weaver<T extends Link<?>> {

    Weaver<T> weave(QalasaPearl<T> qalasaPearl);

    Weaver<T> weave(QalasaPearl<T> qalasaPearl, QalasaPearl<T> connectedPearl);
}
