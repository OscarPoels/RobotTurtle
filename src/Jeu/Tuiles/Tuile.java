package Jeu.Tuiles;

public class Tuile {

    private int x;
    private int y;
    private String type;
    private String couleur;
    private Tortue tortue;

    public Tuile(int x, int y, String type, String couleur) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.couleur = couleur;
    }

    public String getType() {
        return type;
    }

    public String getCouleur() {
        return couleur;
    }


}
