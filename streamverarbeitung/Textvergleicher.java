/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamverarbeitung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

/**
 *
 * @author Alex
 */
public class Textvergleicher {
    
    public boolean sindGleich(Reader reader1, Reader reader2) throws IOException{
        BufferedReader br1 = new BufferedReader(reader1);
        BufferedReader br2 = new BufferedReader(reader2);
        boolean sindGleich = true;
        
        String s1 = br1.readLine();
        String s2 = br2.readLine();
        
        while(s1 != null && s2 != null && sindGleich == true){
            StringTokenizer tokenizer1 = new StringTokenizer(s1, " ,.");
            StringTokenizer tokenizer2 = new StringTokenizer(s2, " ,.");
            
            while(tokenizer1.hasMoreTokens()){
                String token1 = tokenizer1.nextToken();
                String token2 = tokenizer2.nextToken();
                
                System.out.println(token1);
                System.out.println(token2);
                if(!token1.equals(token2)){
                    sindGleich = false;
                    
                }
            }
            s1 = br1.readLine();
            s2 = br2.readLine();
        }
        return sindGleich;
        
        
    }
    
}
