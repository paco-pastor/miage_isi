package example;


import org.main.java.example.TabAlgos; // TODO
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TabAlgosTests {

    @Test
    void plusGrand() {
        assertEquals(1, TabAlgos.plusGrand(new int[] { 1 }));
        assertEquals(8, TabAlgos.plusGrand(new int[] { 1, -5, 8, 0 }));
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.plusGrand(null));
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.plusGrand(new int[] {}));
    }

    @Test
    void moyenne() {
        assertEquals(2.0, TabAlgos.moyenne(new int[] { 1, 3 }));
        assertEquals(3.0, TabAlgos.moyenne(new int[] { 1, 3, 5 }));
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.moyenne(null));
        assertThrows(IllegalArgumentException.class, () -> TabAlgos.moyenne(new int[] {}));
    }

    @Test
    void egaux() {
        assertTrue(TabAlgos.egaux(new int[] { 1, 2 }, new int[] { 1, 2 }));
        assertTrue(TabAlgos.egaux(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 }));
        assertFalse(TabAlgos.egaux(new int[] { 1, 2 }, new int[] { 1, 3 }));
        assertFalse(TabAlgos.egaux(new int[] { 1, 2 }, new int[] { 1, 2, 3 }));
    }

}
