package it.aleph.halls.impl.fate.impl;

import it.aleph.abyss.impl.ManyVoiceFromTheAbyss;
import it.aleph.halls.impl.fate.Tailor;
import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.link.impl.EnchantedMirror;

import java.util.Iterator;

public class HallOfQalasa implements Tailor<QalasaPearl<EnchantedMirror>> {

    private static HallOfQalasa HALL_OF_JUDGMENT;
    private Iterator<QalasaPearl<EnchantedMirror>> roaringChaos;


    private HallOfQalasa(){
        this.roaringChaos = ManyVoiceFromTheAbyss
                .invokeManyVoice()
                .unfoldAbyss()
                .roar()
                .iterator();
    }

    @Override
    public QalasaPearl<EnchantedMirror> weaveFate() {
        if(roaringChaos.hasNext()){
            return roaringChaos.next();
        }
        roaringChaos = ManyVoiceFromTheAbyss
                .invokeManyVoice()
                .unfoldAbyss()
                .roar()
                .iterator();
        return weaveFate();
    }

    public static HallOfQalasa invokeHallOfJudgment(){
        if(HALL_OF_JUDGMENT == null){
            HALL_OF_JUDGMENT = new HallOfQalasa();
        }
        return HALL_OF_JUDGMENT;
    }
}
