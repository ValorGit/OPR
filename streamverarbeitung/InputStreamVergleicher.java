/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamverarbeitung;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class InputStreamVergleicher {
    
    public boolean sindGleich(InputStream stream1, InputStream stream2, long puffergroesse){
        
        byte[] puffer1 = new byte[(int) puffergroesse];
        byte[] puffer2 = new byte[(int) puffergroesse];
        int i = 0;
        boolean sindGleich = true;
        
        
        try {   
            int anzahl = stream1.read(puffer1);
            anzahl = stream2.read(puffer2);
            
            
            System.out.println(anzahl);
            
            for(byte b : puffer1){
                if(puffer1[i] == puffer2[i]){
                    i++;
                } else {
                    return false;
                }
                
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return sindGleich;
        }
        
    }
    

