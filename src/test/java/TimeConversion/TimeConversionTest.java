package TimeConversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TimeConversionTest {

    @Test
    void should() {
        //given
        String s = "12:40:22AM";
        String toCompare = "00:40:22";
        TimeConversion tc = new TimeConversion();
        //when

        String result = tc.timeConversion(s);

        //then
        Assertions.assertEquals(toCompare, result);
    }
}
