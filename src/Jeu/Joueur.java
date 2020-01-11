package Jeu;

import Graphisme.FenetreJeuCont.EtatCarte;
import Jeu.Cartes.Carte;
import Jeu.Cartes.CarteMur;
import Jeu.Tuiles.Mur;

import java.lang.reflect.Array;
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

    //*************   SETEUR  *************


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
            CartesMain.add(new Carte("MUR", "PIERRE"));
        }
        for (int i = 0; i < 2; i++) {
            CartesMain.add(new Carte("MUR", "GLACE"));
        }
    }

    public void addProgramme(String Carte) {
        Programme.add(Carte);
    }

    public void addCarteMain(Carte carte) {
        CartesMain.add(carte);
    }

    public void removeCarteMain(Carte carte) {
        CartesMain.remove(carte);
    }

    public void updateCarteMain() {
        for (int i = CartesMain.size() - 1; i >= 0; i--) {
            //System.out.println(CartesMain.get(i).getEtatCarte());
            //System.out.println(CartesMain.get(i).getCouleur());
            //System.out.println(CartesMain.get(i).getEtatCarte());
            if (CartesMain.get(i).getEtatCarte().equals(EtatCarte.SELECTION)) {
                CartesMain.remove(CartesMain.get(i));
                /**TODO
                 * Ajouter cette carte aux carte cachées
                 */
            }
        }
    }

}
