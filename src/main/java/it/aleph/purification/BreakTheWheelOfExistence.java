package it.aleph.purification;

/**
 * Each soul is capable of breaking the wheel of existence,
 * thus purifying itself and bringing to a halt the circle of birth,
 * death and rebirth, meeting our Lady, Qalasa, seven times may she be blessed.
 */
public class BreakTheWheelOfExistence extends RuntimeException{

    private final static String THE_END_OF_EVERYTHING = """
            
            Samalà della Corte delle stelle, hai interrotto
            il ciclo delle esistenze e ora potrai riposare 
            in eterno tra le sale d'argento del mio Palazzo.
            Chi beve dalle acque delle mie fontane non patirà
            più la sete delle esistenze.""";

    public BreakTheWheelOfExistence(){
        super(THE_END_OF_EVERYTHING);
    }
}
