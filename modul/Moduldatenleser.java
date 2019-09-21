/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author Alex
 */
public class Moduldatenleser {
    
    public Moduldatenleser(){
        
    }
    
    public void lies(Reader reader, Modulverwaltung verwalter) throws IOException{
        
        BufferedReader br = new BufferedReader(reader);
        String zeile = br.readLine();
        Modul neuesModul;
        
        while(zeile != null){
            StringTokenizer tokenizer = new StringTokenizer(zeile, ";,");
            if(tokenizer.hasMoreTokens()){
                neuesModul = new Modul(tokenizer.nextToken(), tokenizer.nextToken());
                
                while(tokenizer.hasMoreTokens()){
                    neuesModul.fuegeHinzu(Studiengang.valueOf(tokenizer.nextToken()));
                }
                verwalter.fuegeHinzu(neuesModul);
                
                
            }
            zeile = br.readLine();
        }
    }
    
}
