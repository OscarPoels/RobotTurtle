package Jeu;

public class Plateau {
    //*************   VARIABLES  *************
    public static String Position[][] = new String[8][8];

    //*************   CONSTRUCTEUR  *************
    public Plateau(int nbJoueur) {
        if (nbJoueur == 2) {
            Position[3][0] = "Joyaux Vert";
            Position[1][7] = "Tortue Rouge";
            Position[5][7] = "Tortue Bleu";
            Position[7][7] = "Mur Pierre";
            Position[7][6] = "Mur Pierre";
            Position[7][5] = "Mur Pierre";
            Position[7][4] = "Mur Pierre";
            Position[7][3] = "Mur Pierre";
            Position[7][2] = "Mur Pierre";
            Position[7][1] = "Mur Pierre";
            Position[7][0] = "Mur Pierre";
        }
        if (nbJoueur == 3) {
            Position[0][0] = "Joyaux Rose";
            Position[3][0] = "Joyaux Verte";
            Position[6][0] = "Joyaux Bleu";
            Position[0][7] = "Tortue Rouge";
            Position[3][7] = "Tortue Bleu";
            Position[6][7] = "Tortue Rose";
            Position[7][7] = "Mur Pierre";
            Position[7][6] = "Mur Pierre";
            Position[7][5] = "Mur Pierre";
            Position[7][4] = "Mur Pierre";
            Position[7][3] = "Mur Pierre";
            Position[7][2] = "Mur Pierre";
            Position[7][1] = "Mur Pierre";
            Position[7][0] = "Mur Pierre";
        }
        if (nbJoueur == 4) {
            Position[1][0] = "Joyaux Rose";
            Position[6][0] = "Joyaux Bleu";
            Position[0][7] = "Tortue Rouge";
            Position[2][7] = "Tortue Bleu";
            Position[5][7] = "Tortue Rose";
            Position[7][7] = "Tortue Verte";
        }
    }


}
