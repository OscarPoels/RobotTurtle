package Graphisme.FenetreJeuCont;


import Graphisme.FenetreJeu;
import Jeu.Cartes.Carte;
import Jeu.Joueur;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;

public class CartesPanel extends JPanel {
    private Joueur joueur;
    public ArrayList<AffichageCarte> listeAffichageCarte = new ArrayList<>();
    public FenetreJeu feJeu;
    private JPanel ConteneurCartes_Tortue = new JPanel();
    private JPanel ConteneurCartes_Mur = new JPanel();

    public CartesPanel(FenetreJeu feJeu) {
        this.joueur = feJeu.getPlateau().getTourJoueur();
        this.feJeu = feJeu;

        JPanel Vide1 = new JPanel();
        JPanel Vide2 = new JPanel();
        JPanel Vide3 = new JPanel();
        JPanel Vide4 = new JPanel();

        GridLayout gridCont = new GridLayout();
        GridLayout gridThis = new GridLayout();

        gridCont.setColumns(joueur.getCartesMain().size());
        gridCont.setRows(1);
        gridCont.setHgap(10);
        gridThis.setRows(2);
        gridThis.setColumns(3);

        this.setLayout(gridThis);
        ConteneurCartes_Tortue.setLayout(gridCont);
        ConteneurCartes_Mur.setLayout(gridCont);
        iniCartePanel();


        this.add(Vide1);
        this.add(Vide2);
        this.add(Vide3);
        this.add(ConteneurCartes_Tortue);
        this.add(Vide4);
        this.add(ConteneurCartes_Mur);

        Vide1.setOpaque(false);
        Vide2.setOpaque(false);
        Vide3.setOpaque(false);
        Vide4.setOpaque(false);
        ConteneurCartes_Tortue.setOpaque(false);
        ConteneurCartes_Mur.setOpaque(false);
        this.setOpaque(false);

    }

    public Joueur getJoueur() {
        return this.joueur;
    }

    public void iniCartePanel() {
        for (int i = 0; i < joueur.getCartesMain().size(); i++) {
            if (joueur.getCartesMain().get(i).getCouleur() == null) {
                AffichageCarte a = new AffichageCarte(joueur.getCartesMain().get(i).getType(), i, joueur, this);
                a.updateCarte(joueur.getCartesMain().get(i));
                ConteneurCartes_Tortue.add(a);
                listeAffichageCarte.add(a);
            } else {
                AffichageCarte a = new AffichageCarte(joueur.getCartesMain().get(i).getType(), joueur.getCartesMain().get(i).getCouleur(), joueur, this);
                a.updateCarte(joueur.getCartesMain().get(i));
                ConteneurCartes_Mur.add(a);
                listeAffichageCarte.add(a);
            }
        }
    }


    public void updateCartePanel() {
        joueur = feJeu.getPlateau().getTourJoueur();
        System.out.println(joueur);
        ConteneurCartes_Tortue.removeAll();
        /** SI LES CARTES DANS LA MAIN SONT MOINS DE 10
         */
        for (int i = 0; i < 10; i++) {
            if (i < joueur.getCartesMain().size()) {
                AffichageCarte carte = listeAffichageCarte.get(i);
                if (joueur.getCartesMain().get(i).getCouleur() == null) {
                    carte.updateCarte(joueur.getCartesMain().get(i));
                    ConteneurCartes_Tortue.add(listeAffichageCarte.get(i));
                } else {
                    carte.updateCarte(joueur.getCartesMain().get(i));
                    ConteneurCartes_Mur.add(listeAffichageCarte.get(i));
                }
            } else {
                AffichageCarte a = new AffichageCarte(null, i, joueur, this);
                ConteneurCartes_Tortue.add(a);
            }
            ConteneurCartes_Tortue.repaint();
            ConteneurCartes_Tortue.revalidate();
        }
    }

    public ArrayList<AffichageCarte> getListeAffichageCarte() {
        return this.listeAffichageCarte;
    }

    public FenetreJeu getFeJeu() {
        return this.feJeu;
    }
}

