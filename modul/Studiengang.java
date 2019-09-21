/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

/**
 *
 * @author Alex
 */
public enum Studiengang {
    
    IN_BA(true),
    MI_BA(true),
    WI_BA(true),
    IN_MA(false),
    MI_MA(false),
    WI_MA(false),
    IS_MA(false);
    
    Studiengang(boolean istBachelorstudiengang){
        this.istBachelorstudiengang = istBachelorstudiengang;
    }
    
    private boolean istBachelorstudiengang;
    
    public boolean istBachelorstudiengang(){
        return this.istBachelorstudiengang;
    }
    
}
