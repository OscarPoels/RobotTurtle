package Jeu;

import com.company.Fenetre;

public class Main {
    public static void main(String[] args) {
        Joueur Jaune = new Joueur();
        Joueur Rouge = new Joueur();
        Plateau Plat = new Plateau(4);
        System.out.println(Jaune.getDeck());
        System.out.println(Rouge.getDeck());
        System.out.println(Rouge.getTailleDeck());
        System.out.println(Rouge.getMain());
        System.out.println(Jaune.getMain());
        display2Darray(Plateau.Position);
        Fenetre a = new Fenetre();
    }

    public static void display2Darray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("|");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == "\t") {
                    System.out.print(array[i][j]);
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                    System.out.print(array[i][j]);
                    System.out.print("\t");
                    System.out.print("|");
                }
            }
            System.out.print("\n");
        }
    }

    public static void menu() {
        System.out.println("Veuillez séléctionnez le nombre de joueur !\n" +
                "Tapez 1 pour 2 joueurs \n" +
                "Tapez 2 pour 3 joueurs \n" +
                "Tapez 3 pour 4 joueurs");

    }

}
