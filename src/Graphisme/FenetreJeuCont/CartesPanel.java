package Graphisme.FenetreJeuCont;


import Jeu.Joueur;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;
import java.text.AttributedCharacterIterator;

public class CartesPanel extends JPanel {
    private Joueur joueur;
    public CartesPanel(Joueur joueur) {
        this.joueur = joueur;
        JPanel ConteneurCartes = new JPanel();
        Texte texte = new Texte();
        GridLayout gridCont = new GridLayout();
        GridLayout gridThis = new GridLayout();

        gridCont.setColumns(joueur.getCartesMain().size());
        gridCont.setRows(1);
        gridCont.setHgap(20);
        gridThis.setRows(2);
        gridThis.setColumns(1);

        this.setLayout(gridThis);
        ConteneurCartes.setLayout(gridCont);

        for (int i = 0; i < 10; i++) {
            if (i < joueur.getCartesMain().size()) {
                if (joueur.getCartesMain().get(i).getCouleur() == null) {
                    ConteneurCartes.add(new AffichageCarte(joueur.getCartesMain().get(i).getType()));
                } else {
                    ConteneurCartes.add(new AffichageCarte(joueur.getCartesMain().get(i).getType(), joueur.getCartesMain().get(i).getCouleur()));
                }
            } else {
                JPanel CartesVide = new JPanel();
                CartesVide.setOpaque(false);
                ConteneurCartes.add(CartesVide);
            }

        }
        this.add(texte);
        this.add(ConteneurCartes);

        texte.setOpaque(false);
        ConteneurCartes.setOpaque(false);
        this.setOpaque(false);
    }

    public static class AffichageCarte extends JPanel {
        private String couleur;
        private String type;

        private AffichageCarte(String type) {
            this.type = type;
        }

        private AffichageCarte(String type, String couleur) {
            this.type = type;
            this.couleur = couleur;
        }

        public void paintComponent(Graphics g) {
            Image imgTuile;
            if (couleur == null) {
                try {
                    imgTuile = ImageIO.read(new File("images\\Cartes\\carte_" + type.toLowerCase() + ".png"));
                    g.drawImage(imgTuile, 0, 0, this.getWidth(), this.getHeight(), this);
                } catch (IOException e) {
                    System.out.println("Impossible de charger l'image :" + "\n" + "images\\Cartes\\carte_" + type.toLowerCase() + ".png");
                }
            } else {
                try {
                    imgTuile = ImageIO.read(new File("images\\Cartes\\carte_" + type.toLowerCase() + "_" + couleur.toLowerCase() + ".png"));
                    g.drawImage(imgTuile, 0, 0, this.getWidth(), this.getHeight(), this);
                } catch (IOException e) {
                    System.out.println("Impossible de charger l'image :" + "\n" + "images\\Cartes\\carte_" + type.toLowerCase() + "_" + couleur.toLowerCase() + ".png");
                }
            }
        }

    }

    public class Texte extends JPanel {
        public void paintComponent(Graphics g) {
            g.drawString(joueur.getCouleur(), 10, 20);
        }
    }

}

