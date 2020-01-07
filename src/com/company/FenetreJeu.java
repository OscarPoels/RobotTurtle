package com.company;


import javax.swing.*;
import java.awt.*;

public class FenetreJeu extends JFrame {
    private static final Dimension TAILLE_CHOIXPANEL = new Dimension(220, 0);
    private static final Dimension TAILLE_PROGRAMME = new Dimension(220, 0);
    private static final Dimension TAILLE_GRILLE = new Dimension(560, 560);
    private static final Dimension CARTES_PANEL_TAILLE = new Dimension(1000, 200);

    public FenetreJeu() {
        JPanel Conteneur = new JPanel();
        BackgroundJeu Background = new BackgroundJeu();
        CartesPanel cartesPanel = new CartesPanel();
        GrillePanel grillePanel = new GrillePanel();
        ProgrammePanel programmePanel = new ProgrammePanel();
        ChoixPanel choixPanel = new ChoixPanel();

        choixPanel.setPreferredSize(TAILLE_CHOIXPANEL);
        //choixPanel.setBackground(Color.BLACK);
        programmePanel.setPreferredSize(TAILLE_PROGRAMME);
        //programmePanel.setBackground(Color.YELLOW);
        grillePanel.setPreferredSize(TAILLE_GRILLE);
        //grillePanel.setBackground(Color.GREEN);
        cartesPanel.setPreferredSize(CARTES_PANEL_TAILLE);
        //cartesPanel.setBackground(Color.RED);

        this.setTitle("Turtle Game");
        //this.setBackground(Color.BLACK);
        this.setSize(1200, 850);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Conteneur.setLayout(new BorderLayout());

        Conteneur.add(cartesPanel, BorderLayout.SOUTH);
        Conteneur.add(grillePanel, BorderLayout.CENTER);
        Conteneur.add(programmePanel, BorderLayout.WEST);
        Conteneur.add(choixPanel, BorderLayout.EAST);
        Conteneur.setOpaque(false);
        this.setContentPane(Background);
        this.add(Conteneur);
        this.setVisible(true);

    }

}