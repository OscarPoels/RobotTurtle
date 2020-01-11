package Graphisme.FenetreJeuCont;

import Jeu.Cartes.Carte;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class AffichageCartesCache extends JPanel {
    private String couleur;
    private String type;
    private boolean isPleine;

    public AffichageCartesCache() {
        //this.setOpaque(false);
    }

    public void paintComponent(Graphics g) {
        Image imgCarte;
        try {
            imgCarte = ImageIO.read(new File("images\\Cartes\\carte_dos.png"));
            g.drawImage(imgCarte, 0, 0, this.getWidth(), this.getHeight(), this);
        } catch (IOException e) {
            System.out.println("Impossible de charger l'image :" + "\n" + "images\\Cartes\\carte_dos.png");
        }
    }

    public void updateCarte(Carte carte) {
        this.type = carte.getType();
        this.couleur = carte.getCouleur();
    }
}