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
public class Mischfolge implements Zahlenfolge {

    PushBackFolge folge1;
    PushBackFolge folge2;

    public Mischfolge(Zahlenfolge folge1, Zahlenfolge folge2) {

        this.folge1 = new PushBackFolge(folge1);
        this.folge2 = new PushBackFolge(folge2);
    }

    @Override
    public boolean hatNaechstes() {
        return folge1.hatNaechstes() || folge2.hatNaechstes();
    }

    @Override
    public int gibNaechstes() {

        int zahl;
        int folge1Zahl;
        int folge2Zahl;

        if (this.hatNaechstes()) {
            if (this.folge1.hatNaechstes() && this.folge2.hatNaechstes()) {
                folge1Zahl = this.folge1.gibNaechstes();
                folge2Zahl = this.folge2.gibNaechstes();
                if (folge1Zahl <= folge2Zahl) {
                    zahl = folge1Zahl;
                    this.folge2.schreibeZurueck(folge2Zahl);
                } else {
                    zahl = folge2Zahl;
                    this.folge1.schreibeZurueck(folge1Zahl);
                }
            } else if (this.folge1.hatNaechstes()) {
                zahl = folge1.gibNaechstes();
            } else {
                zahl = folge2.gibNaechstes();
            }

        } else {
            throw new NoSuchElementException();
        }

        return zahl;

    }

}
