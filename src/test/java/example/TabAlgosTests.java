package example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;


class TabAlgosTests {

    int[] nullData = null;
    int[] emptyData = new int[] {};
    int[] positiveData = new int[] { 1, 2, 3 };
    int[] negativeData = new int[] { -1, -2, -3 };
    int[] mixedData = new int[] { -1, 0, 1 };
    int[] zeroData = new int[] { 0, 0, 0 };
    int[] maxData = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE };
    int[] minData = new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
    int[] maxMinData = new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE };
    
    @Test
    void plusGrand() {
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.plusGrand(nullData));
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.plusGrand(emptyData));
        assertEquals(3, TabAlgos.plusGrand(positiveData));
        assertEquals(-1, TabAlgos.plusGrand(negativeData));
        assertEquals(1, TabAlgos.plusGrand(mixedData));
        assertEquals(0, TabAlgos.plusGrand(zeroData));
        assertEquals(Integer.MAX_VALUE, TabAlgos.plusGrand(maxData));
        assertEquals(Integer.MIN_VALUE, TabAlgos.plusGrand(minData));
        assertEquals(Integer.MAX_VALUE, TabAlgos.plusGrand(maxMinData));
    }

    @Test
    void moyenne() {
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.moyenne(nullData));
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.moyenne(emptyData));
        assertEquals(2, TabAlgos.moyenne(positiveData));
        assertEquals(-2, TabAlgos.moyenne(negativeData));
        assertEquals(0, TabAlgos.moyenne(mixedData));
        assertEquals(0, TabAlgos.moyenne(zeroData));
        assertEquals(Integer.MAX_VALUE, TabAlgos.moyenne(maxData));
        assertEquals(Integer.MIN_VALUE, TabAlgos.moyenne(minData));
        assertEquals(-0.5, TabAlgos.moyenne(maxMinData));
    }

    @Test
    void egaux() {
        assertThrows(NullPointerException.class, () -> TabAlgos.egaux(nullData, nullData));
        assertTrue(TabAlgos.egaux(emptyData, emptyData));
        assertTrue(TabAlgos.egaux(positiveData, positiveData));
        assertTrue(TabAlgos.egaux(negativeData, negativeData));
        assertTrue(TabAlgos.egaux(mixedData, mixedData));
        assertTrue(TabAlgos.egaux(zeroData, zeroData));
        assertTrue(TabAlgos.egaux(maxData, maxData));
        assertTrue(TabAlgos.egaux(minData, minData));
        assertTrue(TabAlgos.egaux(maxMinData, maxMinData));
        assertFalse(TabAlgos.egaux(emptyData, positiveData));
        assertFalse(TabAlgos.egaux(negativeData, mixedData));
        assertFalse(TabAlgos.egaux(zeroData, maxData));
        assertFalse(TabAlgos.egaux(minData, maxMinData));
    }

}
