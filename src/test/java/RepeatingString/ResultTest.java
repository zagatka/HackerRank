package RepeatingString;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {
    @Test
    void should() {
        //given
        String s = "babbaabbabaababaaabbbbbbbababbbabbbababaabbbbaaaaabbaababaaabaabbabababaabaabbbababaabbabbbababbaabb";
        long n = 860622337747L;

        //when
        long result = Result.repeatedString(s, n);

        //then
        Assertions.assertEquals(395886275361L, result);
    }

    @Test
    void should2() {
        //given
        String s = "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
        long n = 549382313570L;

        //when
        long result = Result.repeatedString(s, n);

        //then
        Assertions.assertEquals(16481469408L, result);
    }

    @Test
    void shouldForSubstring() {
        //given
        String s = "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
        long n = 57L;

        //when
        long result = Result.repeatedString(s, n);

        //then
        Assertions.assertEquals(2L, result);
    }

    @Test
    void shouldForString() {
        //given
        String s = "epasaxayaw";
        long n = 5000000000000L;

        //when
        long result = Result.repeatedString(s, n);

        //then
        Assertions.assertEquals(2000000000000L, result);
    }

    @Test
    void shouldForStringAndSubstring() {
        //given
        String s = "epasaxayaw";
        long n = 5000000000006L;

        //when
        long result = Result.repeatedString(s, n);

        //then
        Assertions.assertEquals(2000000000002L, result);
    }

    @Test
    void shouldForStringAndSubstringWithSmallN() {
        //given
        String s = "epasaxayaw";
        long n = 56L;

        //when
        long result = Result.repeatedString(s, n);

        //then
        Assertions.assertEquals(22L, result);
    }
}
