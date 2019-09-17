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
import java.io.InputStreamReader;
import java.io.Reader;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class TextvergleicherTest {
    
    Textvergleicher tv;
    File f1;
    File f2;
    FileInputStream stream1;
    FileInputStream stream2;
    Reader reader1;
    Reader reader2;
   
    
    @Before
    public void setUp() throws FileNotFoundException {
        f1 = new File("D:/Studium/EPR/NetBeansProjects/OPR-Textvergleicher/src/textverarbeitung/TestText1.txt");
        f2 = new File("D:/Studium/EPR/NetBeansProjects/OPR-Textvergleicher/src/textverarbeitung/TestText2.txt");
        
        stream1 = new FileInputStream(f1);
        stream2 = new FileInputStream(f2);
        
        tv = new Textvergleicher();
        
        
    }
    
    @Test
    public void TestSindGleich() throws IOException{
        reader1 = new InputStreamReader(stream1);
        reader2 = new InputStreamReader(stream1);
        
        assertTrue(tv.sindGleich(reader1, reader2));
    }
    
    @Test
    public void TestSindGleich1() throws IOException{
        reader1 = new InputStreamReader(stream1);
        reader2 = new InputStreamReader(stream2);
        
        assertTrue(tv.sindGleich(reader1, reader2));
    }
    
}
