/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textverarbeitung;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class IndexiererTest {
    
    Indexierer index;
    ArrayList<String> ausschlusswoerter;
    
    @Before
    public void setUp() {
        
        ausschlusswoerter = new ArrayList<>();
        
        ausschlusswoerter.add("in");
        ausschlusswoerter.add("und");
        
        index = new Indexierer(ausschlusswoerter);
        
        index.verarbeite("Ulm");
        index.verarbeite("In");
        index.verarbeite("um");
        
        index.verarbeiteZeilenende();
        
        index.verarbeite("Ulm");
        index.verarbeite("um");
        
        
       
    }
    
    @Test
    public void TestGibWoerter(){
        ArrayList<String> sollErgebnis = new ArrayList<>();
        
        sollErgebnis.add("In");
        sollErgebnis.add("Ulm");
        sollErgebnis.add("um");
        
        assertEquals(sollErgebnis, index.gibWoerter());
    }
    
    @Test
    public void TestGibWoerter2(){
        
        ArrayList<String> sollErgebnis = new ArrayList<>();
        
        sollErgebnis.add("In");
        sollErgebnis.add("Ulm");
        sollErgebnis.add("um");
        
        index.verarbeite("und");
        
        assertEquals(sollErgebnis, index.gibWoerter());
        
    }
    
    @Test
    public void TestGibZeilennummern(){
        
        String sollergebnis = "1, 2";
        
        assertEquals(sollergebnis, index.gibZeilennummern("Ulm"));
    }
    
    @Test
    public void TestGibZeilennummern2(){
        
        String sollergebnis = "1";
        
        assertEquals(sollergebnis, index.gibZeilennummern("In"));
    }
    
}
