package CyclicNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicTest {
    @Test
    void shouldRemoveZerosFromString() {
        //given
        Cyclic c = new Cyclic();
        String str = "000123";
        String strToCompare = "123";

        //when
        String result = c.removeZeros(str);

        //then
        Assertions.assertEquals(strToCompare, result);

    }

    @Test
    void shouldIfCyclicGiveTrueFor142857() {
        //given
        Cyclic c = new Cyclic();
        String str = "142857";

        //when
        //then
        Assertions.assertTrue(c.isCyclic(str));
    }

    @Test
    void shouldIfCyclicGiveFalseFor0123() {
        //given
        Cyclic c = new Cyclic();
        String str = "0123";

        //when
        //then
        Assertions.assertFalse(c.isCyclic(str));
    }
}
