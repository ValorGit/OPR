package ComparatorCodeBeispiel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Beipielklasse, dessen Objekte in einem TreeSet sortiert werden sollen.
 * @author Alex
 */
public class Ereignis {
    
    private int jahr;
    private String beschreibung;
    
    public Ereignis(int jahr, String beschreibung){
        this.jahr = jahr;
        this.beschreibung = beschreibung;
    }
    
    public int gibJahr(){
        return this.jahr;
        
    }
    
    public String gibBeschreibung(){
        return this.beschreibung;
    }
}
