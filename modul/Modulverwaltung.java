/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Alex
 */
public class Modulverwaltung {

    private TreeSet<Modul> verwalter;

    public Modulverwaltung() {
        verwalter = new TreeSet<>();
    }

    public void fuegeHinzu(Modul modul) throws IllegalArgumentException {

        if (!verwalter.contains(modul)) {
            verwalter.add(modul);
        } else {
            throw new IllegalArgumentException("Das Modul ist bereits vorhanden.");
        }
    }

    public Set<Modul> gibModule(boolean fuerBachelor) {
        TreeSet<Modul> module = new TreeSet<>();

        if (!verwalter.isEmpty()) {
            Iterator<Modul> iterator = verwalter.iterator();
            Modul naechstesModul;

            if (fuerBachelor) {
                while (iterator.hasNext()) {
                    naechstesModul = iterator.next();
                    if (naechstesModul.istBachelorModul()) {
                        module.add(naechstesModul);
                    }
                }
            } else {
                while (iterator.hasNext()) {
                    naechstesModul = iterator.next();
                    if (!naechstesModul.istBachelorModul()) {
                        module.add(naechstesModul);

                    }
                }
            }

        }
        return module;
    }
}
