package Graphisme.FenetreJeuCont;

import Jeu.Tuiles.Tortue;
import Jeu.Tuiles.Tuile;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;

public class AffichageCase extends JPanel {
    private int x;
    private int y;
    private String type;
    private String couleur;
    private boolean isPleine;
    //private String orientation;

    public AffichageCase(int x, int y) {
        this.x = x;
        this.y = y;
        this.isPleine = false;
    }

    public void paintComponent(Graphics g) {
        if (isPleine) {
            Image imgTuile;
            try {
                Graphics2D g2d = (Graphics2D) g;

                imgTuile = ImageIO.read(new File("images\\Tuiles\\" + type.toLowerCase() + "_" + couleur.toLowerCase() + ".png"));
                if (type.equals("TORTUE")) {
                    g2d.rotate(Math.toRadians(180), this.getWidth() / 2, this.getHeight() / 2);
                }
                g2d.drawImage(imgTuile, 0, 0, this.getHeight(), this.getWidth(), this);

            } catch (IOException e) {
                System.out.println("Impossible de charger l'image :" + "\n" + "images\\Tuiles\\" + type.toLowerCase() + "_" + couleur.toLowerCase() + ".png");
            }

        } else {
            setOpaque(false);
        }
    }

    public void updateCase(Tuile tuile, String orientation) {
        if (tuile == null) {
            this.type = "";
            this.couleur = "";
            //this.orientation = "";
            isPleine = false;
        } else {
            this.type = tuile.getType();
            this.couleur = tuile.getCouleur();
            this.isPleine = true;
            //this.orientation = orientation;
        }
    }

}