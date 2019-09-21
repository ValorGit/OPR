/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class ModulTest {
    
    Modul testmodul;
    
    @Before
    public void setUp() {
         testmodul = new Modul("EPR", "Einführung Programmierung");
    }
    
    @Test
    public void TestFuegeHinzu(){
        testmodul.fuegeHinzu(Studiengang.IN_BA);
        
        String s = "Ein Modul kann nicht gleichzeitig zu Bachelor- und Masterstudiengang gehören";
        
        try{
            testmodul.fuegeHinzu(Studiengang.IN_MA);
            
            fail("Ausnahme wird erwartet");
        }catch(IllegalArgumentException e){
            assertEquals(s, e.getMessage());
            
        }
    }
    
}
