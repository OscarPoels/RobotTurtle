package Jeu.Tuiles;

public class Tortue extends Tuile {
    //*************   VARIABLES  *************
    private String direction;

    //*************   CONSTRUCTEUR  *************

    public Tortue(int x, int y, String couleur, String direction) {
        super(x, y, "TORTUE", couleur);
        this.direction = direction;
    }

    public String getDirection() {
        return this.direction;
    }

}
