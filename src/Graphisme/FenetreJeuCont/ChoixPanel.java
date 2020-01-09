package Graphisme.FenetreJeuCont;

import javax.swing.*;

public class ChoixPanel extends JPanel {

    public ChoixPanel() {
        JButton Construire = new JButton("Construire un mur");
        JButton Compléter = new JButton("Compléter le programme");
        JButton Executer = new JButton("Executer le programme");
        this.setOpaque(false);
        /*
        Construire.setPreferredSize(new Dimension(10,10));
        Executer.setPreferredSize(new Dimension(10,10));
        Compléter.setPreferredSize(new Dimension(10,10));
         */

        this.add(Construire);
        this.add(Compléter);
        this.add(Executer);
        Construire.setBounds(25, 100, 170, 20);
        Compléter.setBounds(10, 200, 200, 20);
        Executer.setBounds(25, 300, 170, 20);
        this.setLayout(null);


    }
}
