package modele;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Remy on 04/11/2016.
 */
public class Plateau {
    private  Joueur joueurN1 ;

    private Joueur joueurN2;

    List<Joueur> joueurs = new ArrayList<Joueur>();

    private Case [][] plateauStratego;

    private static final int TAILLE = 10;




    public Plateau(List<Joueur> Joueurs){

        this.joueurs = Joueurs;
        plateauStratego = new Case[TAILLE][TAILLE];
    }

    public Case[][] getPlateauStratego(){
        return this.plateauStratego;
    }

    public Joueur getJoueurN1() {
        return this.joueurN1;
    }

    public Joueur getJoueurN2(){
        return this.joueurN2;
    }

    public void setJoueurN1(Joueur joueurN1){
        this.joueurN1 = joueurN1;
    }

    public void setJoueurN2(Joueur joueurN2){
        this.joueurN2 = joueurN2;
    }

    public List<Joueur> getJoueurs(){
        return this.joueurs;
    }

    public void setJoueurs(List<Joueur>joueurs){
        this.joueurs = joueurs;
    }


}