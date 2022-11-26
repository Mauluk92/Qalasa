package it.aleph.net;

import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.link.impl.EnchantedMirror;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static it.aleph.halls.chant.impl.enums.Note.ALEPH;

/**
 * The net of existence. Its substance is Qalasà herself, may her name be blessed seven times
 */
public class QalasaNet implements Weaver<EnchantedMirror>  {

    private final Map<QalasaPearl<EnchantedMirror>, List<QalasaPearl<EnchantedMirror>>> net = new HashMap<>();
    private QalasaPearl<EnchantedMirror> pilgrimageOfTheSoul;

    @Override
    public Weaver<EnchantedMirror> weave(QalasaPearl<EnchantedMirror> qalasaPearl) {
        this.net.putIfAbsent(qalasaPearl, new ArrayList<>());
        if(qalasaPearl.getEssence().sing() == ALEPH){
            this.pilgrimageOfTheSoul = qalasaPearl;
        }
        return this;
    }

    @Override
    public Weaver<EnchantedMirror> weave(QalasaPearl<EnchantedMirror> qalasaPearl, QalasaPearl<EnchantedMirror> otherQalasaPearl) {
        this.net.get(qalasaPearl).add(otherQalasaPearl);
        return this;
    }

    public Map<QalasaPearl<EnchantedMirror>, List<QalasaPearl<EnchantedMirror>>> getNet(){
        return this.net;
    }

    public QalasaPearl<EnchantedMirror> unfoldPeregrinage(){
        return this.pilgrimageOfTheSoul;
    }


}
