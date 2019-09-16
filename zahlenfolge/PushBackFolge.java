/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zahlenfolge;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author Alex
 */
public class PushBackFolge implements Zahlenfolge {

    private ArrayList<Integer> pushBack;
    private int pos;
    private Zahlenfolge folge;

    public PushBackFolge(Zahlenfolge folge) {

        this.folge = folge;

        pushBack = new ArrayList<>();

    }

    @Override
    public boolean hatNaechstes() {
        return !pushBack.isEmpty() || this.folge.hatNaechstes();
    }

    public void schreibeZurueck(int i) {
        if (pushBack.isEmpty()) {
            pushBack.add(i);
            pos = 0;
        } else {
            pushBack.add(i);
            pos++;
        }
    }

    @Override
    public int gibNaechstes() {

        int zahl;

        if (this.hatNaechstes()) {
            if (pushBack.isEmpty()) {
                zahl = this.folge.gibNaechstes();
            } else {
                zahl = pushBack.get(pos);
                
                pushBack.remove(pos);
                if (pos > 0) {
                    pos = pos - 1;
                }
            }
        } else {
            System.out.println("Element Exception bei PushBack");
            throw new NoSuchElementException();
        }
//        System.out.println(zahl);
        return zahl;
    }

}
