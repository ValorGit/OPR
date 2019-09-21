/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class ModuldatenleserTest {
    
    private Moduldatenleser testleser;
    private File f;
    private Modulverwaltung verwalter;
    
    
    @Before
    public void setUp() throws FileNotFoundException, IOException {
        
        testleser = new Moduldatenleser();
        
        f = new File("D:/Studium/EPR/NetBeansProjects/OPR-Modulverwaltung/test/modul/Modul.txt");
        
        verwalter = new Modulverwaltung();
        
        FileInputStream inputstream = new FileInputStream(f);
        
        testleser.lies(new InputStreamReader(inputstream), verwalter);
        
        
    }
    
    @Test
    public void testLies(){
        
        Modulverwaltung testverwalter = new Modulverwaltung();
        
        Modul modul1 = new Modul("OPR","Objektorientierte Programmierung");
        modul1.fuegeHinzu(Studiengang.IN_BA);
        modul1.fuegeHinzu(Studiengang.MI_BA);
        modul1.fuegeHinzu(Studiengang.WI_BA);
        
        Modul modul2 = new Modul("EPR","Einfuehrung Programmierung");
        modul2.fuegeHinzu(Studiengang.IN_BA);
        modul2.fuegeHinzu(Studiengang.MI_BA);
        modul2.fuegeHinzu(Studiengang.WI_BA);
        
        Modul modul3 = new Modul("EBW","Einfuehrung Betriebswirtschaft");
        modul3.fuegeHinzu(Studiengang.WI_BA);
        
        testverwalter.fuegeHinzu(modul1);
        testverwalter.fuegeHinzu(modul2);
        testverwalter.fuegeHinzu(modul3);
        
        assertEquals(testverwalter.gibModule(true), verwalter.gibModule(true));
        
    }
    
}

