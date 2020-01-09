package Jeu;

import Jeu.Cartes.Carte;
import Jeu.Cartes.CarteMur;
import Jeu.Tuiles.Mur;

import java.util.ArrayList;
import java.util.Collections;

public class Joueur {
    //*************   VARIABLES  *************

    private String couleur;
    private ArrayList<Carte> Deck = new ArrayList<>();
    private ArrayList<Carte> CartesMain = new ArrayList<>();
    private ArrayList<String> Programme = new ArrayList<>();

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
    }

    private void PiocheDepart() {
        for (int i = 0; i < 5; i++) {
            CartesMain.add(Deck.remove(0));
        }
        for (int i = 0; i < 3; i++) {
            CartesMain.add(new CarteMur("PIERRE"));
        }
        for (int i = 0; i < 2; i++) {
            CartesMain.add(new CarteMur("GLACE"));
        }
    }

    public void Programme(String Carte) {
        Programme.add(Carte);
    }

}
