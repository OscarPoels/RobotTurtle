package Jeu;

import java.util.ArrayList;
import java.util.Collections;

public class Joueur {
    //*************   VARIABLES  *************

    private String couleur;
    private ArrayList<String> Deck = new ArrayList<>();
    private ArrayList<String> CartesMain = new ArrayList<>();
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

    public ArrayList<String> getDeck() {
        return Deck;
    }

    public ArrayList<String> getMain() {
        return CartesMain;
    }

    public int getTailleDeck() {
        return Deck.size();
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

    public int getTailleProgramme() {
        return Programme.size();
    }

    //*************   FONCTIONS  *************

    private void InitialisationDeck() {
        for (int i = 0; i < 18; i++) {
            Deck.add("Carte Bleu");
        }

        for (int i = 0; i < 8; i++) {
            Deck.add("Carte Jaunes");
            Deck.add("Carte Violettes");
        }

        for (int i = 0; i < 3; i++) {
            Deck.add("Carte Laser");
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
