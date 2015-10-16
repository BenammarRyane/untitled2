package com.company;

/**
 * Created by ryane on 16/10/2015.
 */
public class De {
    private int cas;

    public De() {
    }

    public int casHasard() {
        return ((int)(Math.random() * 6 +1)) ;
    }

    public static void main(String[]args){

        Joueur[] plist = new Joueur[4];
        for (int i = 0; i < 4; i++) {
            plist[i]=new Joueur();
        }

        int indicedugagnant =0 ;
        int scoredugagnant = 0 ;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tour n° " + i);
        }
        for (int j = 0; j < plist.length; j++) {
            plist[j].jetDe();
            System.out.println(plist[j]);
        }
        System.out.println("Le vinqueur est le "+plist[indicedugagnant]+ "il a eu le score de: " +scoredugagnant);


    }


}

