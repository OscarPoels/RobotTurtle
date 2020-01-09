package Graphisme.FenetreJeuCont;

import Jeu.Tuiles.Tuile;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;

public class Case extends JPanel {
    private int x;
    private int y;
    private String type;
    private String couleur;
    private boolean isPleine;

    public Case(int x, int y) {
        this.x = x;
        this.y = y;
        this.isPleine = false;
    }

    public void paintComponent(Graphics g) {
        if (isPleine) {
            Image imgTuile;
            try {

                AffineTransform rotation = new AffineTransform();
                Graphics2D g2d = (Graphics2D) g;

                imgTuile = ImageIO.read(new File("images\\Tuiles\\" + type.toLowerCase() + "_" + couleur.toLowerCase() + ".png"));
                rotation.rotate(Math.toRadians(90), (int) (imgTuile.getWidth(this) / 2), (int) (imgTuile.getHeight(this) / 2));
                //double xH = this.getHeight();
                //double yH = imgTuile.getHeight(this);
                //double x1 = xH/yH;
                //double xW = this.getWidth();
                //double yW = imgTuile.getWidth(this);
                //double x2 = xW/yW;
                //rotation.setToScale(x1,x2);
                //g2d.drawImage(imgTuile,rotation, this);
                g.drawImage(imgTuile, 0, 0, this.getWidth(), this.getHeight(), this);
            } catch (IOException e) {
                System.out.println("Impossible de charger l'image :" + "\n" + "images\\Tuiles\\" + type.toLowerCase() + "_" + couleur.toLowerCase() + ".png");
            }

        } else {
            setOpaque(false);
        }
    }

    public void updateCase(Tuile tuile) {
        if (tuile == null) {
            this.type = "";
            this.couleur = "";
            isPleine = false;
        } else {
            this.type = tuile.getType();
            this.couleur = tuile.getCouleur();
            this.isPleine = true;
        }
    }
}