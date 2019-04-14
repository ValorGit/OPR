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
public class Vorgesetzter extends Mitarbeiter {
    
    
    
    
    
    
    
    public Vorgesetzter(String name) {

        super(name);
    }
    
     public void setzeBestelllimit(int limit){
         
         this.limit = limit;
        
    }
    
     public String getName(){
         
         return this.name;
     }
     
     
    @Override 
    public String gibHierarchie(){
        
        String s = "Vorgesetzter "+ name;
        
        if(vorgesetzter != null){
            
            s = vorgesetzter.getName() + "\n" + s; 
            
        }
        
        
        return s;
    }
     
    @Override
     public String gibInfo(){
        
        String s = "";
        
        if(vorgesetzter == null){
            
            s = ("Ich bin Vorgesetzter, Name " + name + ". Mein Bestelllimit ist " + limit + " EUR.");
            
        } else {
            
            s = ("Ich bin Vorgesetzter, Name " + name + ". Mein Vorgesetzter ist " + vorgesetzter.getName() + ". Mein Bestelllimit ist " + limit + " EUR.");
        }
        

         return s;
    }
    
   
}
     

