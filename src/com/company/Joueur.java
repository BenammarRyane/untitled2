package com.company;

/**
 * Created by ryane on 16/10/2015.
 */
public class Joueur {


    private int score = 0 ;
    private int nscore;
    private static int jetde = 0;
    public String nom;

    public Joueur() {
        jetde++;
        this.nom = "Joueur" + jetde;
    }
    public void jetDe() {
        this.nscore = (new Main()).casHasard();
        this.score += this.nscore;
    }
    public String toString() {
        return this.nom + " a eu :  " + this.nscore;
    }
}

