package Jeu;

import Graphisme.Case;
import Graphisme.Fenetre;
import Tuiles.Joyau;
import Tuiles.Mur;
import Tuiles.Tortue;
import Tuiles.Tuile;

public class Plateau {
    public Case[][] ListeCase = new Case[8][8];
    //*************   VARIABLES  *************
    protected Tuile[][] plateau = new Tuile[8][8];
    private Fenetre fenetre;
    private int nbJoueur;

    //*************   CONSTRUCTEUR  *************
    public Plateau(int nbJoueur) {
        iniPlateau(nbJoueur);
    }

    void iniPlateau(int nbJoueur) {
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[i].length; j++) {
                plateau[i][j] = null;
            }
        }
        if (nbJoueur == 2) {
            plateau[0][1] = new Tortue(0, 1, "ROUGE", "S");
            plateau[0][5] = new Tortue(0, 1, "BLEU", "S");
            plateau[7][3] = new Joyau(0, 1, "VERT");
            for (int i = 0; i < plateau.length; i++) {
                plateau[i][7] = new Mur(7, i, "PIERRE");
            }
        }
        if (nbJoueur == 3) {
            plateau[0][0] = new Tortue(0, 0, "ROUGE", "S");
            plateau[0][3] = new Tortue(0, 0, "BLEU", "S");
            plateau[0][6] = new Tortue(0, 0, "ROSE", "S");
            plateau[7][0] = new Joyau(0, 1, "ROSE");
            plateau[7][3] = new Joyau(0, 1, "VERT");
            plateau[7][6] = new Joyau(0, 1, "BLEU");
            for (int i = 0; i < plateau.length; i++) {
                plateau[i][7] = new Mur(7, i, "PIERRE");
            }
        }
        if (nbJoueur == 4) {
            plateau[0][0] = new Tortue(0, 0, "ROUGE", "S");
            plateau[0][2] = new Tortue(0, 0, "BLEU", "S");
            plateau[0][5] = new Tortue(0, 0, "ROSE", "S");
            plateau[0][7] = new Tortue(0, 0, "VERT", "S");
            plateau[7][1] = new Joyau(0, 1, "ROSE");
            plateau[7][6] = new Joyau(0, 1, "BLEU");
        }

        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[i].length; j++) {
                Case c = new Case(i, j);
                ListeCase[i][j] = c;
                c.updateCase(plateau[i][j]);
            }
        }
    }

    public Case[][] getCases() {
        return ListeCase;
    }

    public int getNombreJoueur() {
        return nbJoueur;
    }


}
