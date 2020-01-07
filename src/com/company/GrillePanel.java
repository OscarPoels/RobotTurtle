package com.company;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class GrillePanel extends JPanel {
    private static final Dimension TAILLE_CASES = new Dimension(66, 66);

    public GrillePanel() {
        JPanel Cases = new JPanel();
        GrillePhoto grillePhoto = new GrillePhoto();
        grillePhoto.setBounds(0, 0, 560, 560);
        this.add(Cases);
        this.add(grillePhoto);
        Cases.setBounds(15, 15, 530, 530);
        Cases.setOpaque(false);
        this.setLayout(null);
        initGrille(Cases);
    }

    private void initGrille(JPanel Cases) {
        GridLayout gl = new GridLayout(8, 8);
        gl.setHgap(5);
        gl.setVgap(5);
        Cases.setLayout(gl);

        for (int i = 0; i < 64; i++) {
            Case caseGrille = new Case();
            caseGrille.setBackground(Color.black);
            Cases.add(caseGrille);
        }
    }

    private void updateGrille() {

    }

    public static class GrillePhoto extends JPanel {
        public void paintComponent(Graphics g) {
            try {
                Image img = ImageIO.read(new File("images\\Grille.jpg"));
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class Case extends JPanel {
    Case() {

    }
}


