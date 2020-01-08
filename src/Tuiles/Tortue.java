package Tuiles;

public class Tortue extends Tuile {
    //*************   VARIABLES  *************
    private String couleur;
    private String direction;
    public String type;

    //*************   CONSTRUCTEUR  *************

    public Tortue(int x, int y, String couleur, String direction) {
        super(x, y, "TORTUE", couleur);
    }

}
