package it.aleph.net;

import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.link.impl.EnchantedMirror;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The net of existence. Its substance is Qalasà herself, may her name be blessed seven times
 */
public class QalasaNet  {

    private Map<QalasaPearl<EnchantedMirror>, List<QalasaPearl<EnchantedMirror>>> net = new HashMap<>();


    public void setNet(Map<QalasaPearl<EnchantedMirror>, List<QalasaPearl<EnchantedMirror>>> net) {
        this.net = net;

    }

    public Map<QalasaPearl<EnchantedMirror>, List<QalasaPearl<EnchantedMirror>>> getNet(){
        return this.net;
    }


}
