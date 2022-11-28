package it.aleph.spell;

import it.aleph.spell.impl.enums.Sigill;
import it.aleph.spell.impl.enums.Verb;

/**
 * Each spell can be woven in different ways, thus giving birth to a different effect on its object.
 */
public interface SpellSpool {
    /**
     * A legato chain a spell with another in a way that the two of them have to resonate with the same action
     * @param spell the spell to bind
     * @return Legato, two spell strictly intertwined
     */
    Spell legato(Spell spell);

    /**
     * A staccato chain a spell but with a loose coupling bound.
     * Only one spell has to word in order for the complex to have an effect
     * @param spell the spell to bind
     * @return Staccato, two spell loosely coupled
     */
    Spell staccato(Spell spell);

    /**
     * A bequadro negates the effect of the precedent spell
     * @return the spell negated
     */
    Spell bequadro();

    /**
     * A rest is used to forge a spell which has a word, but which itself cannot be influenced by other spells.
     * It's very much like silence, or a constant function in mathematical expressions
     * @param sigill the sigill to create the word
     * @param verb the verb to create the word
     * @return a Rest with a connected Word
     */
    Spell rest(Sigill sigill, Verb verb);

    /**
     * A word is the minimal unit of a spell. It's the result of a mathematical function which is not constant, and the variable
     * is the verb itself, its action
     * @param verb the action of the word, which determines its effect
     * @param sigill the sigill which bind an object
     * @return a Word
     */
    Spell tune(Verb verb, Sigill sigill);
}
