package Jeu;

import Jeu.Cartes.Carte;

import java.util.ArrayList;
import java.util.Collections;

public class Joueur {
    //*************   VARIABLES  *************

    private String couleur;
    private ArrayList<Carte> Deck = new ArrayList<>();
    private ArrayList<Carte> CartesMain = new ArrayList<>();
    private ArrayList<String> Programme = new ArrayList<>();
    private int MurGlace;
    private int MurPierre;

    //*************   CONSTRUCTEUR  *************
    public Joueur(String couleur) {
        InitialisationDeck();
        PiocheDepart();
        this.couleur = couleur;
    }

    //*************   GETEUR  *************

    public String getCouleur() {
        return couleur;
    }

    public ArrayList<Carte> getDeck() {
        return Deck;
    }

    public ArrayList<Carte> getCartesMain() {
        return CartesMain;
    }

    public int getMurGlace() {
        return MurGlace;
    }

    public int getMurPierre() {
        return MurPierre;
    }

    public ArrayList<String> getProgramme() {
        return Programme;
    }


    //*************   FONCTIONS  *************

    private void InitialisationDeck() {
        for (int i = 0; i < 18; i++) {
            Deck.add(new Carte("Bleu"));
        }

        for (int i = 0; i < 8; i++) {
            Deck.add(new Carte("Jaune"));
            Deck.add(new Carte("Violet"));
        }

        for (int i = 0; i < 3; i++) {
            Deck.add(new Carte("Laser"));
        }
        Collections.shuffle(Deck);
        MurPierre = 3;
        MurGlace = 2;
    }

    private void PiocheDepart() {
        for (int i = 0; i < 5; i++) {
            CartesMain.add(Deck.remove(0));
        }
    }

    public void Programme(String Carte) {
        Programme.add(Carte);
    }

}
