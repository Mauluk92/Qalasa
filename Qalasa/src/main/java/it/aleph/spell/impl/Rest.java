package it.aleph.spell.impl;

import it.aleph.spell.AbstractSpell;
import it.aleph.spell.impl.enums.Verb;

public class Rest extends AbstractSpell {

    private Word commandWord;

    @Override
    public Boolean trace() {
        return true;
    }

    public void setCommandWord(Word word){
        this.commandWord = word;
    }
    public void endowVerb(Verb verb){
        commandWord.endowVerb(verb);
    }

    @Override
    public String toString() {
        return "La sala contiene il sigillo " + commandWord.toString() + " con la parola " + commandWord.revealVerb();
    }
}
