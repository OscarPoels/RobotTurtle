package Jeu.Tuiles;


public class Mur extends Tuile {
    public String type;
    //*************   VARIABLES  *************
    private String couleur;

    //*************   CONSTRUCTEUR  *************

    public Mur(int x, int y, String couleur) {
        super(x, y, "MUR", couleur);
    }

}
