package it.aleph.observer.link.impl.enums;

public enum Note {

    ALEPH("Aleph"),
    BET("Bet"),
    GIMEL("Gimel"),
    DALED("Daled"),
    VAV("Vav"),
    HEI("Hei"),
    ZAYN("Zayn");

    private final String value;

    Note(String value){
        this.value = value;
    }


    @Override
    public String toString() {
        return this.value;
    }
}
