package it.aleph;


import it.aleph.config.PearlConfig;
import it.aleph.config.QalasaConfig;
import it.aleph.net.impl.QalasaPearl;
import it.aleph.observer.impl.Qalasa;
import it.aleph.observer.link.impl.EnchantedMirror;
import it.aleph.wanderer.impl.Samala;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This is the circle of birth, death and rebirth each soul has to go through in order to be purified
 */


public class WheelOfExistence {
    public static void main(String[] args) {
        ApplicationContext heart = new AnnotationConfigApplicationContext(QalasaConfig.class);
        Samala samala = heart.getBean("samala", Samala.class);
        samala.getBud().contemplate(samala.getRevelations());
        samala.wander(samala.getPilgrimage());
    }
}