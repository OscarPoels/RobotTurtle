package Tuiles;

public class Joyau extends Tuile {
    public String type;
    //*************   VARIABLES  *************
    private String couleur;

    //*************   CONSTRUCTEUR  *************

    public Joyau(int x, int y, String couleur) {
        super(x, y, "JOYAU", couleur);
    }
}
