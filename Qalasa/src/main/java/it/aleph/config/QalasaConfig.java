package it.aleph.config;


import it.aleph.net.QalasaNet;
import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.impl.Qalasa;
import it.aleph.observer.link.impl.EnchantedMirror;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import java.util.HashMap;
import java.util.List;

@Configuration
@ComponentScan("it.aleph.wanderer.impl")
@Import({PearlConfig.class, SilverPalaceConfig.class})
public class QalasaConfig {

    @Autowired
    @Qualifier("pearlAleph")
    private QalasaPearl<EnchantedMirror> qalasaPearlAleph;

    @Autowired
    @Qualifier("pearlBet")
    private QalasaPearl<EnchantedMirror> qalasaPearlBet;

    @Autowired
    @Qualifier("pearlGimel")
    private QalasaPearl<EnchantedMirror> qalasaPearlGimel;

    @Autowired
    @Qualifier("pearlDaled")
    private QalasaPearl<EnchantedMirror> qalasaPearlDaled;

    @Autowired
    @Qualifier("pearlHei")
    private QalasaPearl<EnchantedMirror> qalasaPearlHei;

    @Autowired
    @Qualifier("pearlVav")
    private QalasaPearl<EnchantedMirror> qalasaPearlVav;

    @Autowired
    @Qualifier("pearlZayn")
    private QalasaPearl<EnchantedMirror> qalasaPearlZayn;

    @Bean("alephPearls")
    public List<QalasaPearl<EnchantedMirror>> alephPearls(){
        return List.of(qalasaPearlAleph, qalasaPearlBet);
    }

    @Bean("betPearls")
    public List<QalasaPearl<EnchantedMirror>> betPearls(){
        return List.of(qalasaPearlAleph, qalasaPearlBet, qalasaPearlHei, qalasaPearlGimel);
    }

    @Bean("gimelPearls")
    public List<QalasaPearl<EnchantedMirror>> gimelPearls(){
        return List.of(qalasaPearlGimel, qalasaPearlDaled, qalasaPearlBet);
    }

    @Bean("daledPearls")
    public List<QalasaPearl<EnchantedMirror>> daledPearls(){
        return List.of(qalasaPearlDaled, qalasaPearlGimel, qalasaPearlVav, qalasaPearlHei, qalasaPearlVav);
    }

    @Bean("heiPearls")
    public List<QalasaPearl<EnchantedMirror>> heiPearls(){
        return List.of(qalasaPearlDaled, qalasaPearlHei, qalasaPearlDaled);
    }

    @Bean("vavPearls")
    public List<QalasaPearl<EnchantedMirror>> vavPearls(){
        return List.of(qalasaPearlVav, qalasaPearlDaled);
    }

    @Bean("zaynPearls")
    public List<QalasaPearl<EnchantedMirror>> zaynPearls(){
        return List.of(qalasaPearlZayn, qalasaPearlDaled);
    }

    @Bean("qalasa")
    public Qalasa getQalasa(){
        return new Qalasa();
    }

    @Bean("qalasaNet")
    @Autowired
    public QalasaNet getQalasaNet(@Qualifier("alephPearls") List<QalasaPearl<EnchantedMirror>> alephPearls,
                                  @Qualifier("betPearls")List<QalasaPearl<EnchantedMirror>> betPearls,
                                  @Qualifier("daledPearls")List<QalasaPearl<EnchantedMirror>> daledPearls,
                                  @Qualifier("gimelPearls")List<QalasaPearl<EnchantedMirror>> gimelPearls,
                                  @Qualifier("heiPearls")List<QalasaPearl<EnchantedMirror>> heiPearls,
                                  @Qualifier("vavPearls")List<QalasaPearl<EnchantedMirror>> vavPearls,
                                  @Qualifier("zaynPearls")List<QalasaPearl<EnchantedMirror>> zaynPearls){

        var qalasaNet = new QalasaNet();
        var net = new HashMap<QalasaPearl<EnchantedMirror>, List<QalasaPearl<EnchantedMirror>>>();
        net.put(qalasaPearlAleph, alephPearls);
        net.put(qalasaPearlBet, betPearls);
        net.put(qalasaPearlDaled, daledPearls);
        net.put(qalasaPearlGimel, gimelPearls);
        net.put(qalasaPearlHei, heiPearls);
        net.put(qalasaPearlVav, vavPearls);
        net.put(qalasaPearlZayn, zaynPearls);
        qalasaNet.setNet(net);
        return qalasaNet;
    }


}
