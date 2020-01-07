package Jeu;

import Tuiles.Tuile;

import java.util.HashMap;
import java.util.Map;

public abstract class Case {
    private static final Map<Integer, CaseVide> CASE_VIDE = creeCasesVides();
    protected final int coordCase;

    Case(final int coordCase) {
        this.coordCase = coordCase;
    }

    private static Map<Integer, CaseVide> creeCasesVides() {
        final Map<Integer, CaseVide> caseVideHashMap = new HashMap<>();

        for (int i = 0; i < 64; i++) {
            caseVideHashMap.put(i, new CaseVide(i));
        }
        return caseVideHashMap;
    }

    public abstract boolean isCasePleine();

    public abstract Tuile getTuile();

    public static final class CaseVide extends Case {

        CaseVide(int coordonne) {
            super(coordonne);
        }

        @Override
        public boolean isCasePleine() {
            return false;
        }

        @Override
        public Tuile getTuile() {
            return null;
        }
    }

    public static final class CasePleine extends Case {

        private final Tuile tuileSurCase;

        CasePleine(int coordCase, Tuile tuileSurCase) {
            super(coordCase);
            this.tuileSurCase = tuileSurCase;
        }

        @Override
        public boolean isCasePleine() {
            return true;
        }

        @Override
        public Tuile getTuile() {
            return this.tuileSurCase;
        }

    }

}