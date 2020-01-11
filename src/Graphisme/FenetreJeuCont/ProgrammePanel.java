package Graphisme.FenetreJeuCont;

import javax.swing.*;
import java.awt.*;

public class ProgrammePanel extends JPanel {
    public AffichageCartesCache CartesCache;
    public JPanel Console;
    public JPanel Conteneur_CarteCache;

    public ProgrammePanel() {
        Conteneur_CarteCache = new JPanel();
        Console = new JPanel();

        GridLayout gridThis = new GridLayout();
        GridLayout gridCont = new GridLayout();
        gridCont.setColumns(8);
        gridCont.setRows(5);
        gridCont.setHgap(2);
        gridCont.setVgap(2);
        gridThis.setColumns(1);
        gridThis.setRows(2);

        iniProgrammePanel();
        Conteneur_CarteCache.setOpaque(false);
        Conteneur_CarteCache.setLayout(gridCont);
        this.add(Console);
        this.add(Conteneur_CarteCache);
        this.setLayout(gridThis);
        this.setOpaque(false);
        this.setVisible(true);

    }

    public void iniProgrammePanel() {
        for (int i = 0; i < 37; i++) {
            CartesCache = new AffichageCartesCache();
            Conteneur_CarteCache.add(CartesCache);
        }
    }
}
