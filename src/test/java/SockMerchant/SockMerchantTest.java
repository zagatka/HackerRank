package SockMerchant;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SockMerchantTest {
    @Test
    void shouldReturn3ForGivenList() {
        //given
        List<Integer> list = new ArrayList<>();
        Integer[] tab = new Integer[]{1, 2, 5, 1, 1, 1, 2, 3, 4};
        int n = 9;
        list = Arrays.asList(tab);

        //when
        int result = SockMerchant.sockMerchant(n, list);

        //then
        Assertions.assertEquals(3, result);
    }
}
