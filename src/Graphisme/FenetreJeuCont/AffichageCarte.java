package Graphisme.FenetreJeuCont;

import Graphisme.FenetreJeu;
import Jeu.Cartes.Carte;
import Jeu.Joueur;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

public class AffichageCarte extends JPanel {
    private String couleur;
    private String type;
    private int i;
    private Joueur joueur;
    private Carte carte;
    private EtatCarte etatCarte;
    //Affichage des cartes deplacements

    public AffichageCarte(String type, int i, Joueur joueur, CartesPanel cartesPanel) {
        this.joueur = joueur;
        this.type = type;
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {/*EMPTY*/}

            @Override
            public void mousePressed(MouseEvent e) {/*EMPTY*/}

            @Override
            public void mouseExited(MouseEvent e) {/*EMPTY*/}

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (cartesPanel.getFeJeu().getChoixPanel().getMode().equals(Mode.COMPLETER)) {
                    if (carte.getEtatCarte().equals(EtatCarte.RIEN)) {

                        /*joueur.removeCarteMain(joueur.getCartesMain().get(i));
                        for (int j = 0; j < joueur.getCartesMain().size(); j++) {
                            System.out.println(joueur.getCartesMain().get(j).getType());
                        }
                        cartesPanel.updateCartePanel();
                         */
                        carte.setEtatCarte(EtatCarte.SELECTION);
                        cartesPanel.updateCartePanel();
                    } else {
                        carte.setEtatCarte(EtatCarte.RIEN);
                        cartesPanel.updateCartePanel();
                    }
                }
            }
        });

    }

    /**
     * Affichage des cartes murs
     */

    public AffichageCarte(String type, String couleur, Joueur joueur, CartesPanel cartesPanel) {
        this.type = type;
        this.couleur = couleur;

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {/*EMPTY*/}

            @Override
            public void mousePressed(MouseEvent e) {/*EMPTY*/}

            @Override
            public void mouseExited(MouseEvent e) {/*EMPTY*/}

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(":MOUSE_CLICK_EVENT:");
                System.out.println();
            }
        });

    }

    public void paintComponent(Graphics g) {
        Image imgTuile;
        if (!type.equals("RIEN")) {
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
            if (carte.getEtatCarte().equals(EtatCarte.SELECTION)) {
                g.setColor(new Color(0.25f, 0.25f, 0.25f, 0.5f));
                g.fillRect(0, 0, this.getWidth(), this.getHeight());
            }
            if (carte.getEtatCarte().equals(EtatCarte.RIEN)) {
                g.setColor(new Color(0.25f, 0.25f, 0.25f, 0.0f));
                g.fillRect(0, 0, this.getWidth(), this.getHeight());
            }
        } else {
            setOpaque(false);
        }
    }

    public void updateCarte(Carte carte) {
        this.carte = carte;
        this.type = carte.getType();
        this.couleur = carte.getCouleur();
        this.etatCarte = carte.getEtatCarte();
    }

    public void updateCarteSELECTION() {
        for (int i = 0; i < 5; i++) {

        }
    }

}


