package it.aleph.observer;

import it.aleph.observer.link.impl.EnchantedMirror;

public interface Observer {

    void mutate(EnchantedMirror mirror);
}
