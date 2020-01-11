package Graphisme.FenetreJeuCont;

import Graphisme.FenetreJeu;
import Graphisme.FenetreMenu;
import Jeu.Plateau;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoixPanel extends JPanel {
    public Mode mode;
    private JButton Construire;
    private JButton Compléter;
    private JButton Executer;
    private JButton Valider;
    private FenetreJeu fenetreJeu;

    public ChoixPanel(FenetreJeu fenetreJeu) {
        this.fenetreJeu = fenetreJeu;
        iniChoixPanel();
        this.setLayout(null);

        updateChoixPanel();


    }

    private void iniChoixPanel() {
        Construire = new JButton("Construire un mur");
        Compléter = new JButton("Compléter le programme");
        Executer = new JButton("Executer le programme");
        Valider = new JButton("Valider");
        this.setOpaque(false);
        mode = Mode.CHOIX;
        this.add(Construire);
        this.add(Compléter);
        this.add(Executer);
        ChoixPanel.this.add(Valider);
        Construire.setBounds(35, 100, 170, 20);
        Compléter.setBounds(20, 200, 200, 20);
        Executer.setBounds(35, 300, 170, 20);
        Valider.setBounds(20, 200, 200, 20);

        /** TROIS BOUTONS POUR FAIRE CHOIX
         */
        Construire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mode = Mode.CONSTRUIRE;
            }
        });
        Compléter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mode = Mode.COMPLETER;
                updateChoixPanel();
            }
        });
        Executer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        /** BOUTON VALIDER
         */
        Valider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mode = Mode.CHOIX;
                fenetreJeu.getPlateau().getTourJoueur().updateCarteMain();
                fenetreJeu.getFenetreMenu().getPlateau().updateTourJoueur();
                fenetreJeu.getCartesPanel().updateCartePanel();
                //System.out.println(fenetreJeu.getPlateau().getTourJoueur().getCartesMain());
                updateChoixPanel();
            }
        });
    }

    private void updateChoixPanel() {
        if (mode.equals(Mode.CHOIX)) {
            Construire.setVisible(true);
            Compléter.setVisible(true);
            Executer.setVisible(true);
            Valider.setVisible(false);
            ChoixPanel.this.repaint();

        }
        if (mode.equals(Mode.COMPLETER)) {
            Construire.setVisible(false);
            Executer.setVisible(false);
            Compléter.setVisible(false);
            Valider.setVisible(true);
            ChoixPanel.this.repaint();
        }
    }

    public Mode getMode() {
        return mode;
    }

}
