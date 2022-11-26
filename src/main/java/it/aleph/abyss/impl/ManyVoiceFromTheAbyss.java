package it.aleph.abyss.impl;

/**
 * Many voice from the abyss is the primordial roaring lion of chaos. It speaks in countless voices and
 * its cacophony fills the void between the worlds
 */
public class ManyVoiceFromTheAbyss {

    private static ManyVoiceFromTheAbyss MANY_VOICE;
    private final MonadCacophony monadCacophony;

    private ManyVoiceFromTheAbyss(){
        this.monadCacophony = new MonadCacophony();
    }

    public MonadCacophony unfoldAbyss(){
        return this.monadCacophony;
    }



    public static ManyVoiceFromTheAbyss invokeManyVoice(){
        if(MANY_VOICE == null){
            MANY_VOICE = new ManyVoiceFromTheAbyss();
        }
        return MANY_VOICE;
    }

}
