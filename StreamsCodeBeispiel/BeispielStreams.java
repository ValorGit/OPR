/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamsCodeBeispiel;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Beispielhafte Stream anhand der Aufgabe10 aus Klausur 20190708.
 * @author Alex
 */
public class BeispielStreams {
    
    public static void main(String[] args) {
    /*
    * Streams können aus verschiedenen Datentypen erstellt werden. 
    * Bspw. Arrays, Lists oder aus einem BufferedReader.
    * Fur die erste Teilaufgabe wird ein Stream aus einem BufferedReader erstellt.
    */
    BufferedReader r;
    
    /*
    * Um einen Stream aus einen BufferedReader zu erzeugen, wird die Funktion .lines()
    * verwendet.
    * An einen Stream können unendliche viele intermediate operations angehangen werden.
    * Beispielhafte intermediate operations sind .filter und .map.
    * Nachdem der Stream erzeugt wurde, wird der Stream nach Zeilen über 40 Zeichen
    * gefiltert.
    * Nachdem die Filterung vollendet ist, wird über die terminal operation .findFirst
    * das erste Ergebnis ausgegeben. Der Stream kann nach einer terminal operation
    * nicht mehr weiter verarbeitet werden.
    */
//    r.lines()
//            .filter(zeile -> zeile.length() > 40)
//            .findFirst();
    
    /*
    * Teilaufgabe 2.
    * Über die terminal operation .anyMatch wird ein booleanwert ausgegeben, ob
    * eine Zeile, aus dem Reader, 10 oder mehr Zeichen lang ist.
    * .anyMatch ist dabei aufgebaut wie ein Filter. Eine Variabel (der Typ ist durch 
    * die Datenquelle definiert) und die Funktion, die auf den Werten der 
    * Datenquelle angewendet werden soll.
    */
//    r.lines()
//            .anyMatch(zeile -> zeile.length() > 10);
    
    /*
    * Teilaufgabe 3.
    * Streams aus Lists werden über die Methode .stream() erzeugt.
    * Über .collect() können die Werte einer Liste zugeordnet werden.
    */
//    List<Integer> l = null;
//    
//    l.stream()
//            .filter(zahl -> zahl % 2 == 0)
//            .collect(Collectors.toList());
    
    /*
    * Teilaufgabe 4.
    * IntStreams, DoubleStreams, LongStreams und Streams<ObjektTyp> liefern einen
    * unendlichen Stream von Werten.
    * Die Streams können über die Methode .iterate() oder .generate() erzeugt werden.
    * Der Zahlenwert, vor der Funktion, gibt den Startwert an.
    */
    IntStream i = IntStream.iterate(0, n -> n * 2 +1);
    
    /*
    * 2. Möglichkeit.
    */
    IntStream is = IntStream.generate(new IntSupplier() {
        int i = 0;
        public int getAsInt() {
            int j = i;
            i = i * 2 + 1;
            return j;
             
        }
    });
    
    i.limit(10).forEach(System.out::println);
    is.limit(10).forEach(System.out::println);
    
    
            
    }
   
    
    
    
    
    
    
    
}
