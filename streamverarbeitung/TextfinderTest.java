/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamverarbeitung;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class TextfinderTest {
    
    File f;
    FileInputStream testStream;
    Textfinder testFinder;
    
  
    
    @Before
    public void setUp() throws FileNotFoundException, IOException {
        
        f = new File("D:/Studium/EPR/NetBeansProjects/OPR-Textfinder/src/Test.txt");
        testStream = new FileInputStream(f);
        testFinder = new Textfinder(testStream, 4);
        
        
    }
    
    @Test
    public void TestGibWoerter() throws IOException{
        
        HashSet<String> testSet = new HashSet<>();
        testSet.add("dieses");
        testSet.add("Textdokument");
        testSet.add("dient");
        testSet.add("Test");
        
        
        assertEquals(testSet, testFinder.gibWoerter());
        
        
    }
    
    @Test
    public void TestGibHauefigkeit() throws IOException{
        
        assertEquals(3, testFinder.gibHauefigkeit("Test"));
    }
    
}
