package it.aleph.wanderer.impl;


import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.Observer;
import it.aleph.observer.impl.Qalasa;
import it.aleph.observer.link.impl.EnchantedMirror;
import it.aleph.spell.impl.Rest;
import it.aleph.spell.impl.enums.Verb;
import it.aleph.wanderer.Wanderer;
import it.aleph.wanderer.impl.enums.SoulState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static it.aleph.spell.impl.enums.Verb.NE;
import static it.aleph.spell.impl.enums.Verb.QY;
import static it.aleph.wanderer.impl.enums.SoulState.CORRUPTED_STATE;
import static it.aleph.wanderer.impl.enums.SoulState.PURIFIED_STATE;

/**
 * Samalà was once a powerful wizard that came from the kingdom of stars, a plane of existence really close
 * to the Void plane, which embrace everything.
 */
@Component
@Qualifier("samala")
public class Samala implements Wanderer<EnchantedMirror> {

    private final Bud bud;
    private SoulState purifiedState;
    @Autowired
    private Qalasa qalasaSight;

    private final List<String> revelations;

    @Autowired
    @Qualifier("pearlAleph")
    private QalasaPearl<EnchantedMirror> pilgrimage;

    @Autowired
    public Samala(List<String> revelations){
        this.purifiedState = CORRUPTED_STATE;
        this.bud = new Bud();
        this.revelations = revelations;
    }

    public List<String> getRevelations() {
        return this.revelations;
    }

    public void setPilgrimage(QalasaPearl<EnchantedMirror> pilgrimage) {
        this.pilgrimage = pilgrimage;
    }

    public QalasaPearl<EnchantedMirror> getPilgrimage(){
        return this.pilgrimage;
    }

    public void setQalasaSight(Qalasa qalasaSight) {
        this.qalasaSight = qalasaSight;
    }

    public Qalasa getQalasaSight(){
        return this.qalasaSight;
    }

    public Bud getBud(){
        return this.bud;
    }

    @Override
    public void wander(QalasaPearl<EnchantedMirror> qalasaPearl) {

        System.out.println(qalasaPearl);
        wander(qalasaPearl.getEssence());
        var paths = qalasaSight.getQalasaNet()
                .getNet()
                .get(qalasaPearl);
        var choice = bud.unfold(paths.listIterator());
        if(paths.get(choice).getEssence().revealSpell().trace()){
            wander(paths.get(choice));
        }else{
            System.out.println("Le tenebre non permettono di accedere a quest'ala del labirinto");
            wander(qalasaPearl);
        }

    }

    public Bud revealBud(){
        return this.bud;
    }

    @Override
    public void wander(EnchantedMirror mirror) {
        System.out.println(mirror.revealSpell());
        if(mirror.revealSpell() instanceof Rest){
            switch (bud.unfold(Arrays.stream(Verb.values()).toList().listIterator())){
                case 0 -> ((Rest) mirror.revealSpell()).endowVerb(NE);
                case 1 -> ((Rest) mirror.revealSpell()).endowVerb(QY);
            }

        }
        mirror.propagate();

    }

    public void purify(){
        System.out.println("-".repeat(7));
        System.out.println("""
                Nell'incontrare lo sguardo di Qalasa, riconosci il dispiegarsi di ogni cosa,
                uno sguardo dolce e abissale come la mezzanotte d'un cielo senza stelle.
                L'ultima cosa che ricordi è il sorriso di pace nel comprendere ogni cosa al suo
                dissolversi
                """);
        System.out.println("-".repeat(7));
        this.purifiedState = PURIFIED_STATE;
    }

    public SoulState judge(){
        return purifiedState;
    }
}
