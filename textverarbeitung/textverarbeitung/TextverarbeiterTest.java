/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textverarbeitung;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class TextverarbeiterTest {
    
    File f;
    Textverarbeiter testverarbeiter;
    Indexierer indexierer;
    ArrayList<String> ausschlusswoerter;
    
    @Before
    public void setUp() throws IOException {
        
        ausschlusswoerter = new ArrayList<>();
        
        ausschlusswoerter.add("in");
        ausschlusswoerter.add("und");
        
        indexierer = new Indexierer(ausschlusswoerter);
        
        f = new File("D:/Studium/EPR/NetBeansProjects/OPR Praktikum/test/textverarbeitung/test.txt");
        
        InputStreamReader isr = new InputStreamReader(new FileInputStream(f));
        
        testverarbeiter = new Textverarbeiter(indexierer);
        
        testverarbeiter.verarbeite(isr);
        
    }
    
    @Test
    public void TestGibWoerter(){
        
        ArrayList<String> sollErgebnis = new ArrayList<>();
        
        sollErgebnis.add("herum");
        sollErgebnis.add("In");
        sollErgebnis.add("Ulm");
        sollErgebnis.add("um");
        
        Comparator<String> c = (s1 ,s2) -> {
            return s1.toUpperCase().compareTo(s2.toUpperCase());
        };
        
        Collections.sort(sollErgebnis, c);
        assertEquals(sollErgebnis, indexierer.gibWoerter());
        
    }
    
    @Test
    public void TestGibZeilennummern(){
        String s = "1, 2";
        
        assertEquals(s, indexierer.gibZeilennummern("Ulm"));
    }
    
    @Test
    public void TestGibZeilennummern2(){
        String s = "1";
        
        assertEquals(s, indexierer.gibZeilennummern("In"));
    }
    
    @Test
    public void TestGibZeilennummern3(){
        String s = "1, 2";
        
        assertEquals(s, indexierer.gibZeilennummern("um"));
    }
    @Test
    public void TestGibZeilennummern4(){
        String s = "2";
        
        assertEquals(s, indexierer.gibZeilennummern("herum"));
    }
    
    
}
