package JumpingOnClouds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    void should() {
        //given
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);

        //when
        long result = Result.jumpingOnClouds(list);

        //then
        Assertions.assertEquals(2000000000002L, result);
    }

}
