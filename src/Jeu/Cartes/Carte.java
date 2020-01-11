package Jeu.Cartes;

import Graphisme.FenetreJeuCont.EtatCarte;

public class Carte {
    public String type;
    public String couleur;
    public EtatCarte etatCarte = EtatCarte.RIEN;

    public Carte(String type) {
        this.type = type;
    }

    public Carte(String type, String couleur) {
        this.type = type;
        this.couleur = couleur;
    }

    public String getType() {
        return this.type;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public EtatCarte getEtatCarte() {
        return etatCarte;
    }

    public void setEtatCarte(EtatCarte etatCarte) {
        this.etatCarte = etatCarte;
    }

}
