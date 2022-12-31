package it.aleph.config;


import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.link.impl.EnchantedMirror;
import it.aleph.spell.impl.enums.Verb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MirrorConfig.class)
public class PearlConfig {

    @Autowired
    @Qualifier("mirrorAleph")
    private EnchantedMirror enchantedMirrorAleph;

    @Autowired
    @Qualifier("mirrorBet")
    private EnchantedMirror enchantedMirrorBet;

    @Autowired
    @Qualifier("mirrorGimel")
    private EnchantedMirror enchantedMirrorGimel;

    @Autowired
    @Qualifier("mirrorDaled")
    private EnchantedMirror enchantedMirrorDaled;

    @Autowired
    @Qualifier("mirrorHei")
    private EnchantedMirror enchantedMirrorHei;

    @Autowired
    @Qualifier("mirrorVav")
    private EnchantedMirror enchantedMirrorVav;

    @Autowired
    @Qualifier("mirrorZayn")
    private EnchantedMirror enchantedMirrorZayn;

    @Bean(name={"pearlAleph"})
    public QalasaPearl<EnchantedMirror> pearlAleph(){
        var pearl = new QalasaPearl<EnchantedMirror>();
        pearl.setVerb(Verb.NE);
        pearl.setEssence(enchantedMirrorAleph);
        return pearl;
    }

    @Bean(name={"pearlBet"})
    public QalasaPearl<EnchantedMirror> pearlBet(){
        var pearl = new QalasaPearl<EnchantedMirror>();
        pearl.setVerb(Verb.NE);
        pearl.setEssence(enchantedMirrorBet);
        return pearl;
    }

    @Bean(name={"pearlGimel"})
    public QalasaPearl<EnchantedMirror> pearlGimel(){
        var pearl = new QalasaPearl<EnchantedMirror>();
        pearl.setVerb(Verb.NE);
        pearl.setEssence(enchantedMirrorGimel);
        return pearl;
    }

    @Bean(name={"pearlDaled"})
    public QalasaPearl<EnchantedMirror> pearlDaled(){
        var pearl = new QalasaPearl<EnchantedMirror>();
        pearl.setVerb(Verb.NE);
        pearl.setEssence(enchantedMirrorDaled);
        return pearl;
    }

    @Bean(name={"pearlHei"})
    public QalasaPearl<EnchantedMirror> pearlHei(){
        var pearl = new QalasaPearl<EnchantedMirror>();
        pearl.setVerb(Verb.NE);
        pearl.setEssence(enchantedMirrorHei);
        return pearl;
    }

    @Bean(name={"pearlVav"})
    public QalasaPearl<EnchantedMirror> pearlVav(){
        var pearl = new QalasaPearl<EnchantedMirror>();
        pearl.setVerb(Verb.NE);
        pearl.setEssence(enchantedMirrorVav);
        return pearl;
    }

    @Bean(name={"pearlZayn"})
    public QalasaPearl<EnchantedMirror> pearlZayn(){
        var pearl = new QalasaPearl<EnchantedMirror>();
        pearl.setVerb(Verb.NE);
        pearl.setEssence(enchantedMirrorZayn);
        return pearl;
    }

}
