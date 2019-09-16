/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahlenfolge;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class FibonacciFolge implements Zahlenfolge{
    
    ArrayList<Integer> folge;
    int position = 0;
    
    public FibonacciFolge(){
        
        folge = new ArrayList<>();
        
    }

    @Override
    public boolean hatNaechstes() {
        return true;
    }

    @Override
    public int gibNaechstes() {
        
        int zahl = 0;
        
        if(folge.isEmpty()){
            folge.add(zahl);
            position++;
        } else if(folge.size() == 1){
            zahl = 1;
            folge.add(zahl);
            position++;
        } else {
            zahl = folge.get(position - 1) + folge.get(position -2);
            folge.add(zahl);
            position++;
        }
        
        return zahl;
    }
    
}
