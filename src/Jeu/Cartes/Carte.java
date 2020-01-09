package Jeu.Cartes;

public class Carte {
    public String type;
    public String couleur;

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
}
