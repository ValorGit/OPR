/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamverarbeitung;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class InputStreamVergleicherTest {
    
   InputStreamVergleicher isv;
   File testfile1;
   File testfile2;
    
    @Before
    public void setUp() {
        
        isv = new InputStreamVergleicher();
        testfile1 = new File("D:/Studium/EPR/NetBeansProjects/OPR-Textvergleicher/src/textverarbeitung/TestText1.txt");
        testfile2 = new File("D:/Studium/EPR/NetBeansProjects/OPR-Textvergleicher/src/textverarbeitung/TestText2.txt");
    }
    
    @Test
    public void sindGleich() throws FileNotFoundException{
        
        
        assertTrue(isv.sindGleich(new FileInputStream(testfile1), new FileInputStream(testfile2), 5));
    }
    
    @Test
    public void sindGleich1() throws FileNotFoundException{
    
        assertFalse(isv.sindGleich(new FileInputStream(testfile1), new FileInputStream(testfile2), 10));
    }
    
}
