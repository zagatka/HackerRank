package SockMerchant;

import java.util.*;

public class SockMerchant {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {

        Map<Integer, Integer> pairsMap = new HashMap();

        for (Integer el : ar) {
            pairsMap.put(el, setPairsValue(el, pairsMap));
        }

        Collection<Integer> noSocks = new ArrayList();
        noSocks = pairsMap.values();

        int pairs = 0;

        for (Integer el : noSocks) {
            int noPairs = el / 2;
            pairs = noPairs + pairs;
        }

        return pairs;
    }

    private static int setPairsValue(Integer el, Map<Integer, Integer> pairsMap) {
        if (pairsMap.get(el) == null) {
            return 1;
        } else {
            return pairsMap.get(el) + 1;
        }
    }
}
