/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textverarbeitung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

/**
 *
 * @author Alex
 */
public class Textverarbeiter {
    
    private Wortverarbeiter verarbeiter;
    
    public Textverarbeiter(Wortverarbeiter verarbeiter){
        this.verarbeiter = verarbeiter;
    }
    
    public void verarbeite(Reader reader) throws IOException{
        
        BufferedReader br = new BufferedReader(reader);
        
        String zeile = br.readLine();
        
        while(zeile != null){
            StringTokenizer tokenizer = new StringTokenizer(zeile, ".,:;!?-() ");
            while(tokenizer.hasMoreTokens()){
                String token = tokenizer.nextToken();
                verarbeiter.verarbeite(token);
            }
            verarbeiter.verarbeiteZeilenende();
            zeile = br.readLine();
        }
        
    }
    
}
