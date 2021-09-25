package CaesarCipher;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    @Test
    void test1() {
        //given
        String s = "middle-Outz";
        int n = 2;
        String toCompare = "okffng-Qwvb";
        CaesarCipher cc = new CaesarCipher();

        //when
        String result = cc.caesarCipher(s, n);

        //then
        Assertions.assertEquals(toCompare, result);
    }


    @Test
    void test2() {
        //given
        String s = "www.abc.xy";
        int n = 87;
        String toCompare = "fff.jkl.gh";
        CaesarCipher cc = new CaesarCipher();

        //when
        String result = cc.caesarCipher(s, n);

        //then
        Assertions.assertEquals(toCompare, result);
    }
}
