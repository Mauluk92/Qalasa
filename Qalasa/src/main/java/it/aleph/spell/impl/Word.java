package it.aleph.spell.impl;

import it.aleph.spell.impl.enums.Sigill;
import it.aleph.spell.AbstractSpell;
import it.aleph.spell.impl.enums.Verb;

import java.util.Objects;

/**
 * A word is a sigill plus an action. It is the minimal "conatus" of magical power.
 * Each word must be bound to a sigill, and endowed with a Verb
 * @uses Sigill
 * @uses Verb
 */
public class Word extends AbstractSpell {

    private Sigill sigill;

    private Verb action;

    public Word(Verb verb, Sigill sigill){
        this.action = verb;
        this.sigill = sigill;
    }

    public void endowVerb(Verb verb){
        if(verb != this.action) {
            System.out.println("L'incantesimo trasfigura la parola da " + this.action + " in " + verb);
            this.action = verb;
        }else{
            System.out.println("L'incantesimo non ha alcun effetto");
        }
    }

    public Verb revealVerb(){
        return this.action;
    }

    @Override
    public Boolean trace() {
        return Verb.NE == action;
    }

    @Override
    public String toString() {
        return sigill.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Word word = (Word) obj;
        return sigill.equals(word.sigill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sigill);
    }
}
