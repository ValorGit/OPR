/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamverarbeitung;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Alex
 */
public class Textfinder {

    HashMap<String, Integer> woerter;

    public Textfinder(InputStream input, int mindestLaenge) throws IOException {

        InputStreamReader isr = new InputStreamReader(input);
        woerter = new HashMap<>();

        char[] puffer = new char[mindestLaenge];
        String wort = "";

        int anzahl = isr.read(puffer);

        if (anzahl >= mindestLaenge) {
            while (anzahl != -1) {
                for (char c : puffer) {
                    if (wort == "") {
                        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                            wort = wort + c;
//                            System.out.println(wort);
                        }
                    } else {
                        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                            wort = wort + c;

                        } else if (wort.length() >= mindestLaenge) {

                            if (!woerter.containsKey(wort)) {

                                woerter.put(wort, 1);

                                wort = "";

                            } else {
                                woerter.put(wort, woerter.get(wort) + 1);
                                wort = "";

                            }

                        } else {
                            wort = "";
                        }

                    }
                }
                anzahl = isr.read(puffer);
            }

        }
        isr.close();

    }

    public Set<String> gibWoerter() {
        return woerter.keySet();
    }

    public int gibHauefigkeit(String wort) {

        int anzahl = 0;

        if (woerter.containsKey(wort)) {
            anzahl = woerter.get(wort);
        }

        return anzahl;
    }
}
