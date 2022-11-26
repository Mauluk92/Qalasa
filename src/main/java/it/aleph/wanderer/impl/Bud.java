package it.aleph.wanderer.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ListIterator;
import java.util.Scanner;

public class Bud {


    private static Bud bud;
    private final Scanner mind = new Scanner(System.in);


    private Bud(){}

    public void contemplate(){
        mind.nextLine();
    }

    public <T> int unfold(ListIterator<T> paths){
        while(paths.hasNext()){
            System.out.printf("%-2s %s\n", paths.nextIndex(), paths.next());
        }
        return revealBud(paths.nextIndex());
    }

    public static Bud blossom(){
        if(bud == null){
            bud = new Bud();
        }
        return bud;
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
