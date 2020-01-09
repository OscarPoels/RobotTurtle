package Jeu;

import Graphisme.Fenetre;

public class Main {
    private static Fenetre fenetre;
    public static void main(String[] args) {
        /*
        Plateau Plat = new Plateau(4);
        System.out.println(Jaune.getDeck());
        System.out.println(Rouge.getDeck());
        System.out.println(Rouge.getTailleDeck());
        System.out.println(Rouge.getMain());
        System.out.println(Jaune.getMain());
         */

        fenetre = new Fenetre();
        System.out.println(fenetre.getPlateau());

    }

}
