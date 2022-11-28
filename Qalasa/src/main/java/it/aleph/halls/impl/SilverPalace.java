package it.aleph.halls.impl;

import it.aleph.abyss.impl.ManyVoiceFromTheAbyss;
import it.aleph.halls.SilverGearsOfQalasaPalace;
import it.aleph.halls.chant.Chant;
import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.impl.ThreadHalls;
import it.aleph.halls.impl.fate.impl.score.impl.LabyrinthScore;
import it.aleph.music.impl.SacredChant;
import it.aleph.music.impl.SacredScore;
import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.chant.impl.NeverEndingChantOfGenesis;
import it.aleph.observer.chant.impl.NeverEndingSong;
import it.aleph.observer.impl.Qalasa;
import it.aleph.observer.link.impl.EnchantedMirror;
import it.aleph.spell.AbstractSpell;
import it.aleph.spell.Spell;

import java.util.*;
import java.util.stream.Stream;

import static it.aleph.halls.chant.impl.enums.Note.*;
import static it.aleph.spell.impl.enums.Sigill.A;
import static it.aleph.spell.impl.enums.Sigill.B;
import static it.aleph.spell.impl.enums.Verb.NE;
import static it.aleph.spell.impl.enums.Verb.QY;

/**
 * This is the middle of planes, whose center is everywhere, and its circumference nowhere to be found.
 * Here, the souls comes to receive their due under the sight of Qalasà, may her name be blessed seven times.
 */
public class SilverPalace extends SilverGearsOfQalasaPalace<Note, EnchantedMirror> {
    private static SilverPalace SILVER_PALACE;

    private List<QalasaPearl<EnchantedMirror>> pearlsOfFate;
    private SilverPalace(){
    }

    @Override
    public void chant() {
        super.chant();
        Qalasa.invokeQalasa().mutate(Qalasa.invokeQalasa().unfoldPilgrimage().getEssence());

    }

    public static SilverPalace fromVoid(){
        if(SILVER_PALACE == null){
            SILVER_PALACE = new SilverPalace();
        }
        return SILVER_PALACE;
    }

    @Override
    public List<Note> solmization() {
        return Arrays.stream(values()).toList();
    }

    @Override
    public Map<Note, EnchantedMirror> moldMirrorsOfFate() {
        var mirrorsOfFate = Stream.generate(EnchantedMirror::new).limit(Note.values().length).toList();

        mirrorsOfFate.forEach(neverEndingChant(weaveSpells())::tune);
        return giveOrder(mirrorsOfFate);
    }

    @Override
    public Map<Note, AbstractSpell> weaveSpells() {
        var score = new LabyrinthScore();
        return score
                .tune(A,NE)
                .rest(ALEPH, A)
                .bequadro(BET,score.revealNote(A))
                .tune(B, QY)
                .rest(GIMEL, B)
                .rest(DALED, A)
                .legato(HEI,
                        score.revealNote(A),
                        score.revealNote(B))
                .legato(VAV,
                        score.revealNote(A),
                        score.revealNote(B)
                                .bequadro())
                .rest(ZAYN, B)
                .compose();
    }

    @Override
    public Map<Note, QalasaPearl<EnchantedMirror>> generateFromChaos() {

        List<QalasaPearl<EnchantedMirror>> rawPearls = new ArrayList<>();
        while(rawPearls.size() < 7){
           rawPearls.addAll(ManyVoiceFromTheAbyss.invokeManyVoice().unfoldAbyss().roar());
        }
        var boundPearls = giveOrder(rawPearls);
        solmization().forEach((note) ->  Qalasa.invokeQalasa().unfoldNet().weave(boundPearls.get(note)));

        var orderedPearls = giveOrder(rawPearls);

        Qalasa.invokeQalasa().setFate(orderedPearls.get(setFate()));
        return orderedPearls;

    }

    @Override
    public Map<Note, List<Note>> generateCounterChant() {
        var sacredScore = new SacredScore();
        return sacredScore
                .compose(ALEPH, List.of(ALEPH, BET))
                .compose(BET, List.of(ALEPH, BET, GIMEL, HEI))
                .compose(GIMEL, List.of(GIMEL, BET, DALED))
                .compose(DALED, List.of(DALED, GIMEL, VAV, HEI, ZAYN))
                .compose(VAV, List.of(VAV, DALED))
                .compose(HEI, List.of(HEI, DALED, BET))
                .compose(ZAYN, List.of(ZAYN, DALED))
                .revealSacredScore();
    }

    @Override
    public Chant<Note> chantOfFate() {
        return ThreadHalls.invokeThreadHalls().revealHalls().get(ZAYN).weaveFate().reveal();
    }

    @Override
    public Chant<EnchantedMirror> neverEndingChant(Map<Note, AbstractSpell> spells) {
        SacredChant<Spell, EnchantedMirror> sacredChant = new SacredChant<>(new NeverEndingSong());

        Arrays.stream(Note.values()).forEach((note) -> sacredChant.compose(note, spells.get(note)));
        return sacredChant.reveal();
    }

    @Override
    public Chant<QalasaPearl<EnchantedMirror>> weaveNet(Map<Note, List<Note>> counterMelody) {
        var sacredChant = new SacredChant<>(new NeverEndingChantOfGenesis());
        solmization().forEach((note) -> sacredChant.compose(note, counterMelody.get(note)));

        return sacredChant.reveal();
    }

    @Override
    public Note setFate() {
        return ALEPH;
    }


    public <T> Map<Note,T> giveOrder(Iterable<T> entities){
        Map<Note, T> orderFromChaos = new HashMap<>();
        var eyeOfQalasa = entities.iterator();
        solmization().forEach((note) -> orderFromChaos.putIfAbsent(note, eyeOfQalasa.next()));
        return orderFromChaos;
    }
}
