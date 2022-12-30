package it.aleph;


import it.aleph.observer.SilverPalace;
import it.aleph.wanderer.impl.Samala;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This is the circle of birth, death and rebirth each soul has to go through in order to be purified
 */


public class WheelOfExistence {
    public static void main(String[] args) {
        ApplicationContext heart = new ClassPathXmlApplicationContext(
                "qalasa.xml",
                "samala.xml",
                "mirror.xml",
                "simpleSpell.xml",
                "compoundSpell.xml",
                "net.xml",
                "pearl.xml");
        Samala samala = heart.getBean("samala", Samala.class);
        samala.getBud().contemplate(heart.getBean("silverPalace", SilverPalace.class).getFate());
        samala.wander(samala.getQalasaSight().unfoldPilgrimage());
    }
}