package it.aleph.config;

import it.aleph.spell.Spell;
import it.aleph.spell.impl.Bequadro;
import it.aleph.spell.impl.Legato;
import it.aleph.spell.impl.Rest;
import it.aleph.spell.impl.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.List;

@Configuration
@Import(WordConfig.class)
public class SpellConfig {
    @Autowired
    @Qualifier("wordA")
    private Word wordA;

    @Autowired
    @Qualifier("wordB")
    private Word wordB;

    @Bean(name={"aleph", "daled"})
    public Spell getSpellAleph(){
        return new Rest(wordA);
    }

    @Bean(name={"bet"})
    public Spell getSpellBet(){
        return new Bequadro(wordA);
    }

    @Bean(name={"gimel", "zayn"})
    public Spell getSpellGimel(){
        return new Rest(wordB);
    }

    @Bean(name={"hei"})
    public Spell getSpellHei(){
        return new Legato(List.of(wordA, wordB));
    }

    @Bean(name={"vav"})
    public Spell getSpellVav(){
        return new Legato(List.of(wordA, new Bequadro(wordB)));
    }


}
