package Graphisme.FenetreJeuCont;


import Graphisme.FenetreJeu;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class GrillePanel extends JPanel {
    private FenetreJeu fenetre;
    private static final Dimension TAILLE_CASES = new Dimension(66, 66);

    public GrillePanel(FenetreJeu fenetre) {
        JPanel Cases = new JPanel();
        this.fenetre = fenetre;
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
        AffichageCase[][] listeAffichageCases = fenetre.getPlateau().getCases();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                AffichageCase affichageCaseGrille = listeAffichageCases[i][j];
                Cases.add(affichageCaseGrille);
            }
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





