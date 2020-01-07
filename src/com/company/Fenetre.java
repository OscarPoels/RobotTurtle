package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Fenetre extends JFrame {
    public int nbJoueur = 0;
    private FenetreJeu FeJeu;

    public Fenetre() {
        Background Back = new Background();
        //Boutons différents
        JButton Bouton2J = new JButton("2 Joueurs");
        Bouton2J.setPreferredSize(new Dimension(150, 40));
        JButton Bouton3J = new JButton("3 Joueurs");
        Bouton3J.setPreferredSize(new Dimension(150, 40));
        JButton Bouton4J = new JButton("4 Joueurs");
        Bouton4J.setPreferredSize(new Dimension(150, 40));
        //Parametre de base
        this.setTitle("Turtle Game");
        this.setSize(775, 1002);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Back);
        Back.setLayout(new BorderLayout());

        //Conteneur principal
        JPanel conteneurMenu = new JPanel();
        conteneurMenu.setPreferredSize(new Dimension(100, 100));
        conteneurMenu.setOpaque(false);

        //Position composants
        conteneurMenu.add(Bouton2J);
        conteneurMenu.add(Bouton3J);
        conteneurMenu.add(Bouton4J);
        this.getContentPane().add(conteneurMenu, BorderLayout.SOUTH);
        this.setVisible(true);

        Bouton2J.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("2 Joueurs");
                nbJoueur = 2;
                FeJeu = new FenetreJeu();
                dispose();
            }
        });
        Bouton3J.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("3 Joueurs");
                nbJoueur = 3;
                FeJeu = new FenetreJeu();
                dispose();
            }
        });
        Bouton4J.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("4 Joueurs");
                nbJoueur = 4;
                FeJeu = new FenetreJeu();
                dispose();
            }
        });
    }

}