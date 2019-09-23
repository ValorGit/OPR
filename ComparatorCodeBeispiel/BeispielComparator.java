package ComparatorCodeBeispiel;


import java.util.Comparator;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Über den Comparator wird definiert, wie das TreeSet oder die TreeMap sortiert
 * werden soll. 
 * Bei der Sortierung von Objekten ist ein Comparator zwingend erforderlich!
 * Der Comparator lässt sich über 2 Alternativen implementieren. 
 * Beispiele anhand Aufgabe 8 aus Klausur 20190708
 */
public class BeispielComparator {
    
    /*
    * 1. Möglichkeit: Erstellen eines seperaten Comparators.
    * Dem Comparator wird ein Objekttyp übergeben der verglichen werden soll.
    * @param e1 Ereignis1
    * @param e2 Ereignis2
    */
    Comparator<Ereignis> c = (e1 , e2) -> {
        /*
        * Das Jahr der beiden Ereignisse wird verglichen. 
        * Bei einem negativen Wert, wird e1 als ersten ausgegeben. Bei einem postiven
        * e2.
        */
        int frueher = e1.gibJahr() - e2.gibJahr();
        
        /*
        * Liegen beide Ereignisse im gleichen Jahr, werden die Ereignisse nach
        * der alphabetischen Reihenfolge ihrer Beschreibung sortiert. Dies
        * wird über die compareTo-Methode realisiert.
        */
        return frueher == 0
                ? e1.gibBeschreibung().compareTo(e2.gibBeschreibung())
                : frueher;
    };
    
    /*
    * Der Comparator wird dem TreeSet als Parameter übergeben.
    */
    TreeSet<Ereignis> ereignisse = new TreeSet<>(c);
    
    
    /*
    * 2. Möglichkeit: Reailisierung direkt im TreeSet.
    */
    TreeSet<Ereignis> ereignisse2 = new TreeSet<>((e1, e2) -> {
        
        int frueher = e1.gibJahr() - e2.gibJahr();
        
        
        return frueher == 0
                ? e1.gibBeschreibung().compareTo(e2.gibBeschreibung())
                : frueher;
        
    });
    
    
    
}
