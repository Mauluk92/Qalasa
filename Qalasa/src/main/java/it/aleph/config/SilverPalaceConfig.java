package it.aleph.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SilverPalaceConfig {

    private final static String firstRevelation =
            """
            Samalà della corte delle stelle, la tua rosa ha rintoccato l'ultima nota..
            Io sono Qalasà, la Signora dei mondi, ho fabbricato questa realtà dal nulla del caos..
            """;

    private final static String secondRevelation =
            """
            In principio era solo il caos ruggente di Millevoci dell'Abisso.
            Una cacofonia priva di senso e ordine, il vorticare ignoto
            degli elementi.
            Ma con il mio Canto ho domato il mare in tempesta del Vuoto.
            Dando forma al senza-forma...
            """;

    private final static String thirdRevelation =
            """
            Samalà Della Corte delle stelle, quel che spetta alle anime
            che hanno abbandonato la loro veste corporea è il Giudizio,
            ...
            """;

    private final static String fourthRevelation =
            """
            Dovrai vagare per le mie sale per incontrarmi. Se non riuscirai,
            la pena sarà vagare di nuovo affinché tu sia purificato dalle pene passate.
            Le mie sale sono specchi che riflettono l'animo di chi le osserva
            """;

    private final static String fifthRevelation = """
            Nel mondo esistono due sole forze, l'Amore e l'Odio, la Vita e la Morte.
            Chiunque voglia raggiungermi deve usare entrambe poiché L'Amore senza odio è privo di forza,
            e l'Odio privo di amore è cieco e senza direzione...
            Se saprai imbrigliarle, potrai navigare il labirinto e incontrarmi, muovendo ogni cosa
            a tua volontà, poiché Tutto è in Me, ed io sono in Ogni cosa
            """;

    private final static String sixthRevelation = """
            Tutto infatti è intessuto in questa Rete infinita,
            che abbraccia ogni cosa e si allarga perennemente.
            Chiunque veda dentro se stesso può alterare questa rete,
            solo sussurrando il mio nome nel pensiero.
            Perché ciò che viene chiesto con la fede, io lo
            concedo..
            """;

    private final static String seventhRevelation = """
            Preparati ad addentrarti nel labirinto...
            """;

    @Bean
    public static List<String> getRevelations(){
        return List.of(firstRevelation, secondRevelation, thirdRevelation, fourthRevelation, fifthRevelation, sixthRevelation, seventhRevelation);
    }
}
