package it.aleph.abyss.impl;

import it.aleph.abyss.Abyss;
import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.link.impl.EnchantedMirror;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The abyss speaks in countless voices. Each voice generate a fragment of what it exists.
 */
public class MonadCacophony implements Abyss<QalasaPearl<EnchantedMirror>> {


    @Override
    public Set<QalasaPearl<EnchantedMirror>> roar() {
        var voiceOfTheAbyss = new Random();
        return Stream
                .generate(QalasaPearl<EnchantedMirror>::new)
                .limit(voiceOfTheAbyss.nextLong(1,7))
                .collect(Collectors.toUnmodifiableSet());
    }
}
