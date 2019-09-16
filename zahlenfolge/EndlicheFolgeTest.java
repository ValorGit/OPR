package zahlenfolge;

import org.junit.Test;

/**
 * Testklasse für Methoden der Klasse EndlicheFolge.
 */
public class EndlicheFolgeTest {

    /**
     * Testet Methoden hatNaechstes und gibNaechstes.
     */
    @Test
    public void testZugriffAufFolge1() {

        ZahlenfolgeTestUtil.testZugriffAufFolge(
                new EndlicheFolge(new int[0]),
                new Integer[0],
                false);
    }

    /**
     * Testet Methoden hatNaechstes und gibNaechstes.
     */
    @Test
    public void testZugriffAufFolge2() {

        ZahlenfolgeTestUtil.testZugriffAufFolge(
                new EndlicheFolge(new int[]{8, 5, 2, 5}),
                new Integer[]{8, 5, 2, 5},
                false);
    }
}
