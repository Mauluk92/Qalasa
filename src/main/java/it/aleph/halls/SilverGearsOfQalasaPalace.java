package it.aleph.halls;

import it.aleph.halls.chant.Chant;
import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.impl.Qalasa;
import it.aleph.observer.link.Link;
import it.aleph.spell.AbstractSpell;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static it.aleph.halls.chant.impl.enums.Note.ALEPH;

public abstract class SilverGearsOfQalasaPalace<Note extends Enum<?>, T extends Link<Note>> implements Genesis {



    @Override
    public void chant(){
        solmization().forEach(chantOfFate()::tune);
        var mirrors = moldMirrorsOfFate();
        solmization().forEach((note) -> mirrors.get(note).attach(Qalasa.invokeQalasa(), note));
        var spells = weaveSpells();
        solmization().forEach((note) -> neverEndingChant(spells).tune(mirrors.get(note)));
        var pearlsOfFate = generateFromChaos();
        solmization().forEach((note) -> pearlsOfFate.get(note).endowEssence(mirrors.get(note)));
        var sacredChantOfQalasa = weaveNet(generateCounterChant());
        solmization().forEach((note) -> sacredChantOfQalasa.tune(pearlsOfFate.get(note)));

    }


    abstract public List<Note> solmization();
    abstract public Map<Note, T> moldMirrorsOfFate();
    abstract public Map<Note, AbstractSpell> weaveSpells();
    abstract public Map<Note,QalasaPearl<T>> generateFromChaos();
    abstract public Map<Note, List<Note>> generateCounterChant();
    abstract public Chant<Note> chantOfFate();
    abstract public Chant<T> neverEndingChant(Map<Note, AbstractSpell> spells);
    abstract public Chant<QalasaPearl<T>> weaveNet(Map<Note,List<Note>> counterMelody);
    public abstract Note setFate();


}
