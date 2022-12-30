package it.aleph.wanderer.impl;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * The bud of a mortal soul, its rose, is the innermost core essence, the spark endowed by Qalasà herself.
 */
public class Bud {

    private final Scanner mind = new Scanner(System.in);

    public void contemplate(List<String> fate){
        fate.forEach(revelation -> {
            System.out.println(revelation);
            mind.nextLine();
        });
    }

    public <T> int unfold(ListIterator<T> paths){
        while(paths.hasNext()){
            System.out.printf("%-2s %s\n", paths.nextIndex(), paths.next());
        }
        return revealBud(paths.nextIndex());
    }

    public int revealBud(Integer order){
        int choice;
        try{
            choice = Integer.parseInt(mind.nextLine());
            if(choice >= order){
                System.out.println("La tua mente sta valicando i confini delle possibilità.");
                return revealBud(order);
            }
            return choice;
        }catch(NumberFormatException ex){
            System.out.println("Disciplina la tua mente e rischiara la strada");
            return revealBud(order);
        }

    }





}
