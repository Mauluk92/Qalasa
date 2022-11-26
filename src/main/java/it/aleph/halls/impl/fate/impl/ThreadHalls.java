package it.aleph.halls.impl.fate.impl;

import it.aleph.halls.chant.impl.ThreadOfFate;
import it.aleph.halls.impl.fate.Halls;
import it.aleph.halls.impl.fate.Tailor;
import it.aleph.halls.impl.fate.impl.subhalls.*;
import it.aleph.observer.chant.impl.NeverEndingChantOfFate;

import java.util.List;

/**
 * In these halls the fate of mortals is woven.
 */
public class ThreadHalls extends Halls<ThreadOfFate> implements Tailor<ThreadOfFate>{

    private static ThreadHalls THREAD_HALLS;

    private final List<Tailor<NeverEndingChantOfFate>> hallsOfFate;

    private ThreadHalls(){
        this.hallsOfFate = List.of(
                new FirstHallOfRevelation(),
                new SecondHallOfRevelation(),
                new ThirdHallOfRevelation(),
                new FourthHallOfRevelation(),
                new FifthHallOfRevelation(),
                new SixthHallOfRevelation(),
                new SeventhHallOfRevelation()
        );
    }

    @Override
    public ThreadOfFate weaveFate() {
        var revelations = this.hallsOfFate.stream()
                .map(Tailor::weaveFate)
                .map(NeverEndingChantOfFate::sing)
                .toList();



        return recursiveChant(revelations, ThreadOfFate::compose);
    }


    public static ThreadHalls invokeThreadHalls(){
        if(THREAD_HALLS == null){
            THREAD_HALLS = new ThreadHalls();
        }
        return THREAD_HALLS;
    }


}
