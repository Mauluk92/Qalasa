package it.aleph.observer;

import java.util.List;

public class SilverPalace {

    private final List<String> fate;


    public SilverPalace(List<String> fate){
        this.fate = fate;
    }

    public List<String> getFate(){
        return this.fate;
    }
}
