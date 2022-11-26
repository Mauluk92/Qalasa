package it.aleph.halls.impl.fate.impl;

import it.aleph.halls.chant.Chant;
import it.aleph.halls.chant.impl.ChantOfTheHalls;
import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.Halls;
import it.aleph.halls.impl.fate.Tailor;
import it.aleph.observer.chant.impl.NeverEndingSong;
import it.aleph.observer.chant.music.impl.SacredChant;
import it.aleph.observer.link.impl.EnchantedMirror;
import it.aleph.spell.Spell;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The hall of mirrors is where each particular judgment for a soul is fabricated, with a special kind of glass that
 * does not reflect the body but the mind of the observer.
 */
public class HallOfMirrors extends Halls<ChantOfTheHalls> implements Tailor<List<EnchantedMirror>> {

    private static HallOfMirrors HALL_OF_MIRRORS;

    private HallOfMirrors(){
    }

    @Override
    public List<EnchantedMirror> weaveFate() {
        return moldGlassOfFate();
    }

    private List<EnchantedMirror> moldGlassOfFate(){
        List<EnchantedMirror> mirrorsOfFate =  Arrays
                .stream(Note.values())
                .map(EnchantedMirror::new)
                .collect(Collectors.toList());
        mirrorsOfFate.forEach(chant()::tune);
        return mirrorsOfFate;
    }

    private Chant<EnchantedMirror> chant(){
        var spells = HallOfGenesis.invokeHallOfGenesis().weaveFate();
        SacredChant<Spell, EnchantedMirror> sacredChant = new SacredChant<>(new NeverEndingSong());

        Arrays.stream(Note.values()).forEach((note) -> sacredChant.compose(note, spells.get(note)));
        return sacredChant.reveal();
    }

    public static HallOfMirrors invokeHallOfMirrors(){
        if(HALL_OF_MIRRORS == null){
            HALL_OF_MIRRORS = new HallOfMirrors();
        }
        return HALL_OF_MIRRORS;
    }
}
