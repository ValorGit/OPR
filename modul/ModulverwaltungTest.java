/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import java.util.TreeSet;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class ModulverwaltungTest {
    
    Modulverwaltung testverwalter;
    Modul epr;
    Modul opr;
    Modul ebw;
    Modul map;
    
    @Before
    public void setUp() {
        
        testverwalter = new Modulverwaltung();
        
        epr = new Modul("EPR", "Einführung in die Programmierung");
        epr.fuegeHinzu(Studiengang.IN_BA);
        epr.fuegeHinzu(Studiengang.MI_BA);
        epr.fuegeHinzu(Studiengang.WI_BA);
        
        opr = new Modul("OPR", "Objektorientierte Programmierung");
        opr.fuegeHinzu(Studiengang.IN_BA);
        opr.fuegeHinzu(Studiengang.MI_BA);
        opr.fuegeHinzu(Studiengang.WI_BA);
        
        map = new Modul("MAP", "Master Programmierung");
        map.fuegeHinzu(Studiengang.IN_MA);
        
        ebw = new Modul("EBW", "Einführung in die Betriebswirtschaft");
        ebw.fuegeHinzu(Studiengang.IN_BA);
        ebw.fuegeHinzu(Studiengang.MI_BA);
        ebw.fuegeHinzu(Studiengang.WI_BA);
        
        testverwalter.fuegeHinzu(epr);
        testverwalter.fuegeHinzu(opr);
        testverwalter.fuegeHinzu(ebw);
        testverwalter.fuegeHinzu(map);
        
        
        
    }
    
    @Test
    public void TestFuegeHinzu(){
        
        String s = "Das Modul ist bereits vorhanden.";
        
        try{
            testverwalter.fuegeHinzu(epr);
            
            fail("Ausnahme wird erwartet");
            
            
        }catch(IllegalArgumentException e){
            assertEquals(s, e.getMessage());
        }
    }
    
    @Test
    public void TestGibModule(){
        TreeSet<Modul> soll = new TreeSet<>();
        
        soll.add(epr);
        soll.add(opr);
        soll.add(ebw);
        
        assertEquals(soll,testverwalter.gibModule(true));
    }
    
    @Test
    public void TestGibModule2(){
        TreeSet<Modul> soll = new TreeSet<>();
        
        soll.add(map);
        
        assertEquals(soll, testverwalter.gibModule(false));
    }
    
}
