package Jeu;

import Graphisme.FenetreJeuCont.AffichageCase;
import Jeu.Tuiles.Joyau;
import Jeu.Tuiles.Mur;
import Jeu.Tuiles.Tortue;
import Jeu.Tuiles.Tuile;

import java.util.ArrayList;
import java.util.Collections;

public class Plateau {

    //*************   VARIABLES  *************
    private Tuile[][] plateau = new Tuile[8][8];
    private AffichageCase[][] listeAffichageCase = new AffichageCase[8][8];
    private ArrayList<Joueur> ListeJoueur = new ArrayList<>();
    private int nbJoueur;
    private Joueur TourJoueur;
    private String[][] orientation = new String[8][8];
    private int Tour = 0;

    //*************   CONSTRUCTEUR  *************
    public Plateau(int nbJoueur) {
        iniPlateau(nbJoueur);
    }

    private void iniPlateau(int nbJoueur) {
        this.nbJoueur = nbJoueur;
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[i].length; j++) {
                plateau[i][j] = null;
                orientation[i][j] = null;
            }
        }
        if (nbJoueur == 2) {
            plateau[0][1] = new Tortue(0, 1, "ROUGE", "S");
            orientation[0][1] = "S";
            plateau[0][5] = new Tortue(0, 5, "BLEU", "S");
            orientation[0][5] = "S";
            plateau[7][3] = new Joyau(7, 3, "VERT");
            orientation[7][3] = "S";
            Joueur Rouge = new Joueur("ROUGE");
            Joueur Bleu = new Joueur("BLEU");
            ListeJoueur.add(Rouge);
            ListeJoueur.add(Bleu);
            this.nbJoueur = nbJoueur;
            for (int i = 0; i < plateau.length; i++) {
                plateau[i][7] = new Mur(i, 7, "PIERRE");
            }
        }
        if (nbJoueur == 3) {
            plateau[0][0] = new Tortue(0, 0, "ROUGE", "S");
            orientation[0][0] = "S";
            plateau[0][3] = new Tortue(0, 3, "BLEU", "S");
            orientation[0][3] = "S";
            plateau[0][6] = new Tortue(0, 6, "ROSE", "S");
            orientation[0][6] = "S";
            plateau[7][0] = new Joyau(7, 0, "ROSE");
            plateau[7][3] = new Joyau(7, 3, "VERT");
            plateau[7][6] = new Joyau(7, 6, "BLEU");
            for (int i = 0; i < plateau.length; i++) {
                plateau[i][7] = new Mur(i, 7, "PIERRE");
            }
            Joueur Rouge = new Joueur("ROUGE");
            Joueur Bleu = new Joueur("BLEU");
            Joueur Rose = new Joueur("ROSE");
            ListeJoueur.add(Rouge);
            ListeJoueur.add(Bleu);
            ListeJoueur.add(Rose);
            this.nbJoueur = nbJoueur;
        }
        if (nbJoueur == 4) {
            plateau[0][0] = new Tortue(0, 0, "ROUGE", "S");
            orientation[0][0] = "S";
            plateau[0][2] = new Tortue(0, 2, "BLEU", "S");
            orientation[0][2] = "S";
            plateau[0][5] = new Tortue(0, 5, "ROSE", "S");
            orientation[0][5] = "S";
            plateau[0][7] = new Tortue(0, 7, "VERT", "S");
            orientation[0][7] = "S";
            plateau[7][1] = new Joyau(7, 1, "ROSE");
            plateau[7][6] = new Joyau(7, 6, "BLEU");
            Joueur Rouge = new Joueur("ROUGE");
            Joueur Bleu = new Joueur("BLEU");
            Joueur Rose = new Joueur("ROSE");
            Joueur Vert = new Joueur("VERT");
            ListeJoueur.add(Rouge);
            ListeJoueur.add(Bleu);
            ListeJoueur.add(Rose);
            ListeJoueur.add(Vert);
            this.nbJoueur = nbJoueur;
        }

        updatePlateau();
        iniTourJoueur();
    }

    public void updatePlateau() {
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[i].length; j++) {
                AffichageCase c = new AffichageCase(i, j);
                listeAffichageCase[i][j] = c;
                c.updateCase(plateau[i][j], orientation[i][j]);
            }
        }
    }

    public AffichageCase[][] getCases() {
        return listeAffichageCase;
    }

    public int getNombreJoueur() {
        return this.nbJoueur;
    }

    public ArrayList<Joueur> getListeJoueur(){
        return this.ListeJoueur;
    }

    public void iniTourJoueur(){
        Collections.shuffle(ListeJoueur);
        TourJoueur =  ListeJoueur.get(0);
        //System.out.println(ListeJoueur.get(0).getCouleur());
        for (int i = 0 ; i < ListeJoueur.size(); i++) {
            // System.out.println(ListeJoueur.get(i).getCouleur());
        }
    }

    public void updateTourJoueur() {
        Tour++;
        TourJoueur = ListeJoueur.get((Tour) % nbJoueur);
        System.out.println(Tour);
    }

    public Joueur getTourJoueur() {
        return TourJoueur;
    }


}
