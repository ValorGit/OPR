package zahlenfolge;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Testklasse für Methoden der Klasse EindeutigeFolge.
 */
public class EindeutigeFolgeTest {

    /**
     * Testet Methoden hatNaechstes und gibNaechstes.
     */
    @Test
    public void testZugriffAufFolge1() {

        ZahlenfolgeTestUtil.testZugriffAufFolge(
                new EindeutigeFolge(new EndlicheFolge(new int[0])),
                new Integer[0],
                false);
    }
    
    /**
     * Testet Methoden hatNaechstes und gibNaechstes.
     */
    @Test
    public void testZugriffAufFolge2() {
        
//        EindeutigeFolge testFolge = new EindeutigeFolge(
//                    new EndlicheFolge(new int[]{0, 0, 0, 1, 2, 3, 3, 4, 4}));
//        
//        Assert.assertEquals(0, testFolge.gibNaechstes());
//        Assert.assertEquals(1, testFolge.gibNaechstes());

        ZahlenfolgeTestUtil.testZugriffAufFolge(
                new EindeutigeFolge(
                    new EndlicheFolge(new int[]{0, 0, 0, 1, 2, 3, 3, 4, 4, 5})),
                new Integer[]{0, 1, 2, 3, 4, 5},
                false);
    }
    
    /**
     * Testet Methoden hatNaechstes und gibNaechstes.
     */
    @Test
    public void testZugriffAufFolge3() {

        ZahlenfolgeTestUtil.testZugriffAufFolge(
                new EindeutigeFolge(new FibonacciFolge()),
                new Integer[]{0, 1, 2, 3, 5, 8},
                true);
    }
}
