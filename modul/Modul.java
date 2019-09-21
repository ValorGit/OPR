/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Alex
 */
public class Modul implements Comparable{

    private String kuerzel;
    private String bezeichnung;
    private HashSet<Studiengang> angeboteneStudiengaenge;

    public Modul(String kuerzel, String bezeichnung) {
        this.kuerzel = kuerzel;
        this.bezeichnung = bezeichnung;
        angeboteneStudiengaenge = new HashSet<>();
    }

    public void fuegeHinzu(Studiengang studiengang) throws IllegalArgumentException {

        if (angeboteneStudiengaenge.isEmpty()) {
            angeboteneStudiengaenge.add(studiengang);
        } else {
            Iterator<Studiengang> iterator = angeboteneStudiengaenge.iterator();
            if ((studiengang.istBachelorstudiengang() && iterator.next().istBachelorstudiengang())
                    || (!studiengang.istBachelorstudiengang() && !iterator.next().istBachelorstudiengang())) {
                angeboteneStudiengaenge.add(studiengang);
            } else {
                throw new IllegalArgumentException("Ein Modul kann nicht "
                        + "gleichzeitig zu Bachelor- und Masterstudiengang gehören");
            }
        }

    }

    public boolean istBachelorModul() {

        boolean istBachelorModul = false;

        if (!angeboteneStudiengaenge.isEmpty()) {
            Iterator<Studiengang> iterator = angeboteneStudiengaenge.iterator();

            if (iterator.next().istBachelorstudiengang()) {
                istBachelorModul = true;
            }
        }
        return istBachelorModul;
    }

    @Override
    public String toString() {
        String s = this.kuerzel + ";" + this.bezeichnung + ";";

        if (!angeboteneStudiengaenge.isEmpty()) {
            Iterator<Studiengang> iterator = angeboteneStudiengaenge.iterator();
            while (iterator.hasNext()) {
                s = s + iterator.next().toString();
                if (iterator.hasNext()) {
                    s = s + ",";
                }
            }

        }
        return s;
    }

    @Override
    public boolean equals(Object obj) {

        boolean istGleich = false;

        if (obj instanceof Modul) {
            Modul modul = (Modul) obj;

            istGleich = this.kuerzel.equalsIgnoreCase(modul.kuerzel)
                    && this.bezeichnung.equalsIgnoreCase(modul.bezeichnung);
        }
        return istGleich;
    }

    @Override
    public int hashCode() {
        return this.kuerzel.hashCode() + this.bezeichnung.hashCode();
    }

    @Override
    public int compareTo(Object t) {
        
        int compare = 0;
        if(t instanceof Modul){
            Modul modul = (Modul) t;
            
            compare = this.kuerzel.compareToIgnoreCase(modul.kuerzel);
        }
        return compare;
    }
    
    

}
