package Graphisme.FenetreJeuCont;


import Jeu.Joueur;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;

public class CartesPanel extends JPanel {

    public CartesPanel(Joueur joueur) {
        JPanel ConteneurCartes = new JPanel();
        Texte texte = new Texte();
        GridLayout gridCont = new GridLayout();
        GridLayout gridThis = new GridLayout();

        gridCont.setColumns(joueur.getCartesMain().size());
        gridCont.setRows(1);
        gridCont.setHgap(130);
        gridThis.setRows(2);
        gridThis.setColumns(1);

        this.setLayout(gridThis);
        ConteneurCartes.setLayout(gridCont);

        for (int i = 0; i < joueur.getCartesMain().size(); i++) {
            ConteneurCartes.add(new AffichageCarte(joueur.getCartesMain().get(i).getType()));
        }
        this.add(texte);
        this.add(ConteneurCartes);

        texte.setOpaque(false);
        ConteneurCartes.setOpaque(false);
        this.setOpaque(false);
    }

    public class Texte extends JPanel {
        public void paintComponent(Graphics g) {
            g.drawString("Carte dans la main :", 10, 20);
        }
    }

    public class AffichageCarte extends JPanel {
        public String type;

        public AffichageCarte(String type) {
            this.type = type;
        }

        public void paintComponent(Graphics g) {
            Image imgTuile;
            try {
                imgTuile = ImageIO.read(new File("images\\Cartes\\carte_" + type.toLowerCase() + ".png"));
                g.drawImage(imgTuile, 0, 0, this.getWidth(), this.getHeight(), this);
            } catch (IOException e) {
                System.out.println("Impossible de charger l'image :" + "\n" + "images\\Cartes\\carte_" + type.toLowerCase() + ".png");
            }
        }

    }

}

