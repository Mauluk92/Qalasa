package it.aleph.config;


import it.aleph.spell.impl.Word;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static it.aleph.spell.impl.enums.Sigill.A;
import static it.aleph.spell.impl.enums.Sigill.B;
import static it.aleph.spell.impl.enums.Verb.NE;
import static it.aleph.spell.impl.enums.Verb.QY;

@Configuration
public class WordConfig {

    @Bean(name="wordA")
    public Word getAWord(){
        return new Word(NE, A);
    }

    @Bean(name="wordB")
    public Word getBWord(){
        return new Word(QY, B);
    }
}
