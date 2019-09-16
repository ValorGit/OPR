/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahlenfolge;

import java.util.NoSuchElementException;

/**
 *
 * @author Alex
 */
public class EndlicheFolge implements Zahlenfolge {
    
    int[] folge;
    int position = 0;
    
    public EndlicheFolge(int[] folge){
        
        this.folge = folge;
        
    }

    @Override
    public boolean hatNaechstes() {
       return position < folge.length;
    }

    @Override
    public int gibNaechstes(){
        
        int zahl;
        
        if(this.hatNaechstes()){
            zahl = folge[position];
            position++;
            
        } else {
            
            throw new NoSuchElementException();
        }
        return zahl;
    }
    
}
