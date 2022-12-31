package it.aleph.config;

import it.aleph.observer.Observer;
import it.aleph.observer.impl.Qalasa;
import it.aleph.observer.link.impl.EnchantedMirror;
import it.aleph.observer.link.impl.enums.Note;
import it.aleph.spell.Spell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

@Configuration
@Import(SpellConfig.class)
public class MirrorConfig {


    @Bean(name={"mirrorAleph"})
    @Autowired
    public EnchantedMirror getAlephMirror(@Qualifier("aleph") Spell spell){
        var mirror = new EnchantedMirror();
        mirror.setEssence(spell);
        mirror.setNote(Note.ALEPH);
        return mirror;
    }

    @Bean(name={"mirrorBet"})
    @Autowired
    public EnchantedMirror getBetMirror(@Qualifier("bet") Spell spell){
        var mirror = new EnchantedMirror();
        mirror.setEssence(spell);
        mirror.setNote(Note.BET);
        return mirror;
    }

    @Bean(name={"mirrorGimel"})
    @Autowired
    public EnchantedMirror getGimelMirror(@Qualifier("gimel") Spell spell){
        var mirror = new EnchantedMirror();
        mirror.setEssence(spell);
        mirror.setNote(Note.GIMEL);
        return mirror;
    }

    @Bean(name={"mirrorDaled"})
    @Autowired
    public EnchantedMirror getDaledMirror(@Qualifier("daled") Spell spell){
        var mirror = new EnchantedMirror();
        mirror.setEssence(spell);
        mirror.setNote(Note.DALED);
        return mirror;
    }

    @Bean(name={"mirrorHei"})
    @Autowired
    public EnchantedMirror getHeiMirror(@Qualifier("hei") Spell spell){
        var mirror = new EnchantedMirror();
        mirror.setEssence(spell);
        mirror.setNote(Note.HEI);
        return mirror;
    }

    @Bean(name={"mirrorVav"})
    @Autowired
    public EnchantedMirror getVavMirror(@Qualifier("vav") Spell spell){
        var mirror = new EnchantedMirror();
        mirror.setEssence(spell);
        mirror.setNote(Note.VAV);
        return mirror;
    }

    @Bean(name={"mirrorZayn"})
    @Autowired
    public EnchantedMirror getZaynMirror(@Qualifier("zayn") Spell spell){
        var mirror = new EnchantedMirror();
        mirror.setEssence(spell);
        mirror.setNote(Note.ZAYN);
        return mirror;
    }

}
