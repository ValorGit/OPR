/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahlenfolge;

import java.util.HashSet;
import java.util.NoSuchElementException;

/**
 *
 * @author Alex
 */
public class EindeutigeFolge implements Zahlenfolge{
    
    private Zahlenfolge folge1;
    private HashSet<Integer> eindeutigeFolge;
    
    public EindeutigeFolge(Zahlenfolge folge1){
        this.folge1 = folge1;
        eindeutigeFolge = new HashSet<>();
        
        
        
    }

    @Override
    public boolean hatNaechstes() {
        return this.folge1.hatNaechstes();
    }

    @Override
    public int gibNaechstes() {
        int zahl;
        
        if(this.hatNaechstes()){
            zahl = this.folge1.gibNaechstes();
            while(eindeutigeFolge.contains(zahl)){
                zahl = this.folge1.gibNaechstes();
            }
            eindeutigeFolge.add(zahl);
        } else {
            throw new NoSuchElementException();
        }
        return zahl;
    }
    
}
