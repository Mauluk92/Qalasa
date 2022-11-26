package it.aleph.halls.impl;

import it.aleph.halls.Genesis;
import it.aleph.halls.chant.impl.NeverEndingChantOfQalasa;
import it.aleph.halls.chant.impl.enums.Note;
import it.aleph.halls.impl.fate.Halls;
import it.aleph.halls.impl.fate.impl.HallOfMirrors;
import it.aleph.halls.impl.fate.impl.HallOfQalasa;
import it.aleph.halls.impl.fate.impl.ThreadHalls;
import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.chant.impl.NeverEndingChantOfGenesis;
import it.aleph.observer.impl.Qalasa;
import it.aleph.observer.link.impl.EnchantedMirror;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static it.aleph.halls.chant.impl.enums.Note.*;

/**
 * This is the middle of planes, whose center is everywhere, and its circumference nowhere to be found.
 * Here, the souls comes to receive their due under the sight of Qalasà, may her name be blessed seven times.
 */
public class SilverPalace extends Halls<NeverEndingChantOfQalasa> implements Genesis {
    private static SilverPalace SILVER_PALACE;

    private List<QalasaPearl<EnchantedMirror>> pearlsOfFate;
    private SilverPalace(){
    }

    @Override
    public void chant() {
        Arrays.stream(values()).toList().forEach(ThreadHalls.invokeThreadHalls().weaveFate()::tune);
        var qalasaPearlsOfFate = Stream.generate(HallOfQalasa.invokeHallOfJudgment()::weaveFate).limit(Note.values().length).toList();
        var mirrorsOfFate = HallOfMirrors.invokeHallOfMirrors().weaveFate();
        IntStream.range(0, 7).forEach((order) -> qalasaPearlsOfFate.get(order).endowEssence(mirrorsOfFate.get(order)));
        this.pearlsOfFate = qalasaPearlsOfFate;
        dominateVoid();
        Qalasa.invokeQalasa().mutate(Qalasa.invokeQalasa().unfoldNet().unfoldPeregrinage().getEssence());

    }

    private NeverEndingChantOfQalasa tuneNeverEndingChant(Note note, List<Note> counterMelody){
        return new NeverEndingChantOfGenesis()
                .weaveChant(note, this.pearlsOfFate.stream().filter(qalasaPearl -> counterMelody.contains(qalasaPearl.getEssence().sing())).toList()).sing();
    }

    private void dominateVoid(){

        var chants = List.of(tuneNeverEndingChant(ALEPH, List.of(ALEPH, BET)),
                tuneNeverEndingChant(BET, List.of(ALEPH, BET, GIMEL, HEI)),
                tuneNeverEndingChant(GIMEL, List.of(GIMEL, BET, DALED)),
                tuneNeverEndingChant(DALED, List.of(DALED, GIMEL, VAV, HEI, ZAYN)),
                tuneNeverEndingChant(VAV, List.of(VAV, DALED)),
                tuneNeverEndingChant(HEI, List.of(HEI, DALED, BET)),
                tuneNeverEndingChant(ZAYN, List.of(ZAYN, DALED)));
        NeverEndingChantOfQalasa sacredChant = recursiveChant(chants, NeverEndingChantOfQalasa::compose);

        this.pearlsOfFate.forEach(sacredChant::tune);
    }

    public static SilverPalace fromVoid(){
        if(SILVER_PALACE == null){
            SILVER_PALACE = new SilverPalace();
        }
        return SILVER_PALACE;
    }
}
