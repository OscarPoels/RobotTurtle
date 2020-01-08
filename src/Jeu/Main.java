package Jeu;

import Graphisme.Fenetre;

public class Main {
    public static Fenetre fenetre;
    public static void main(String[] args) {
        Joueur Jaune = new Joueur();
        Joueur Rouge = new Joueur();
        //Plateau Plat = new Plateau(4);
        System.out.println(Jaune.getDeck());
        System.out.println(Rouge.getDeck());
        System.out.println(Rouge.getTailleDeck());
        System.out.println(Rouge.getMain());
        System.out.println(Jaune.getMain());
        fenetre = new Fenetre();

    }


    public static void menu() {
        System.out.println("Veuillez séléctionnez le nombre de joueur !\n" +
                "Tapez 1 pour 2 joueurs \n" +
                "Tapez 2 pour 3 joueurs \n" +
                "Tapez 3 pour 4 joueurs");

    }

}
