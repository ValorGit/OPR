/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author Alex
 */
public class Mitarbeiter {
    
    public String name;
    
    public int limit = 20;
    
    public Vorgesetzter vorgesetzter = null;
    
    
    public Mitarbeiter(String name){
        
        this.name = name;
    }
    
    public void setzeAllgemeinesLimit(int limit){
        
        this.limit = limit;
        
    }
    
    public void setzeVorgesetzten(Vorgesetzter vorgesetzter){
        
        if (vorgesetzter == null){
            this.vorgesetzter = null;
        } else {
            
            this.vorgesetzter = vorgesetzter;
            
        }
        
    }
    
    public boolean darfBestellen(int bestellwert){
        
        return bestellwert <= limit;
    }
    
    public String gibHierarchie(){
        
        String s = "";
        
        if(vorgesetzter == null){
            
            s = "freier Mitarbeiter " + name;
            
        } else {
            
            s = "Vorgesetzter " + vorgesetzter.gibHierarchie() + "\n" + "Mitarbeiter " + this.name; 
        }
        
        return s;
    }
    
    
    
    
  
    public String gibInfo(){
        
        String s = "";
        
        if(vorgesetzter == null){
            
            s = ("Ich bin freier Mitarbeiter, Name " + name + ". Mein Bestelllimit ist " + limit + " EUR.");
            
        } else {
            
            s = ("Ich bin Mitarbeiter, Name " + name + ". Mein Vorgesetzter ist " + vorgesetzter.getName() + ". Mein Bestelllimit ist " + limit + " EUR.");
        }
        

         return s;
    }
    
   
}
