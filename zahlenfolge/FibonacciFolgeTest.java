package zahlenfolge;

import org.junit.Test;

/**
 * Testklasse für Methoden der Klasse FibonacciFolge.
 */
public class FibonacciFolgeTest {

    /**
     * Testet Methoden hatNaechstes und gibNaechstes.
     */
    @Test
    public void testZugriffAufFolge1() {

        ZahlenfolgeTestUtil.testZugriffAufFolge(
                new FibonacciFolge(),
                new Integer[0],
                true);
    }

    /**
     * Testet Methoden hatNaechstes und gibNaechstes.
     */
    @Test
    public void testZugriffAufFolge2() {

        ZahlenfolgeTestUtil.testZugriffAufFolge(
                new FibonacciFolge(),
                    new Integer[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144},
                true);
    }
}
