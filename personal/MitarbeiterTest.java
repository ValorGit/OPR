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
public class MitarbeiterTest {
    
     public static void main(String[] args) {

        Mitarbeiter winkelmann = new Mitarbeiter("Walter Winkelmann");
        Vorgesetzter wichtig = new Vorgesetzter("Waltraud Wichtig");
        Vorgesetzter wichtiger = new Vorgesetzter("Herrmann Wichtiger");
        
        winkelmann.setzeVorgesetzten(wichtig);
        wichtig.setzeVorgesetzten(wichtiger);
        
         System.out.println(winkelmann.darfBestellen(15));
         System.out.println(winkelmann.darfBestellen(20));
         System.out.println(winkelmann.darfBestellen(21));
         
        wichtig.setzeBestelllimit(10);
        
         System.out.println(wichtig.darfBestellen(10));
         System.out.println(wichtig.darfBestellen(11));
         
         wichtig.setzeBestelllimit(5000);
         
         System.out.println(wichtig.gibInfo());
         
         wichtig.setzeVorgesetzten(null);
         
         System.out.println(wichtig.gibInfo());
//         

//         System.out.println(winkelmann.gibInfo());
//         
         Mitarbeiter winzig = new Mitarbeiter ("Willi Winzig");
         
//         
//         System.out.println(winzig.gibInfo());
//         System.out.println(wichtig.gibInfo());
//         
         System.out.println(winkelmann.gibHierarchie());
         System.out.println(winzig.gibHierarchie());
         
         
        
        
    }
    
}
