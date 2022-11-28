package it.aleph.wanderer.impl.enums;

public enum SoulState {

    CORRUPTED_STATE("La tua anima non è pura a sufficienza"),
    PURIFIED_STATE("La tua anima è stata purificata dalle pene passate");

    private final String value;

    SoulState(String value){
        this.value = value;
    }


    @Override
    public String toString() {
        return this.value;
    }
}
