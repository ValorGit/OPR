/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textverarbeitung;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Alex
 */
public class Indexierer implements Wortverarbeiter {

    private Collection<String> ausschlusswoerter;
    private TreeMap<String, HashSet<Integer>> index;
    private int zeile = 1;

    public Indexierer(Collection<String> ausschlusswoerter) {
        this.ausschlusswoerter = ausschlusswoerter;
        index = new TreeMap<>();
    }

    @Override
    public void verarbeite(String s) {
        HashSet<Integer> zeilennummern;

        if (!ausschlusswoerter.contains(s)) {
            if (index.containsKey(s)) {
                index.get(s).add(zeile);
            } else {
                zeilennummern = new HashSet<>();
                zeilennummern.add(zeile);
                index.put(s, zeilennummern);
            }
        }
    }

    @Override
    public void verarbeiteZeilenende() {
        zeile++;
    }

    public List<String> gibWoerter() {

        ArrayList<String> woerter = new ArrayList<>();

        Set<String> woerterSet = index.keySet();

        Iterator<String> iterator = woerterSet.iterator();

        while (iterator.hasNext()) {
            woerter.add(iterator.next());
        }
        Comparator<String> c = (s1 ,s2) -> {
            return s1.toUpperCase().compareTo(s2.toUpperCase());
        };
                
        Collections.sort(woerter, c);

        return woerter;

    }

    public String gibZeilennummern(String wort) {
        String zeilennummern = "";

        HashSet<Integer> zeilenSet = index.get(wort);
        Iterator<Integer> iterator = zeilenSet.iterator();

        while (iterator.hasNext()) {
            if (zeilennummern.isEmpty()) {
                zeilennummern = zeilennummern + iterator.next();
            } else {
                zeilennummern = zeilennummern + ", " + iterator.next();
            }
        }
        return zeilennummern;

    }

}
