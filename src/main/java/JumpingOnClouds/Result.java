package JumpingOnClouds;

import java.util.List;

class Result {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int counter = 0;
        for (int i = 2; i < c.size(); i = test(c.size(), i)) {
            if (c.get(i) == 1) {
                i--;
            }
            counter++;
        }
        return counter;
    }

    public static int test(int sizeOfList, int i) {
        return i + 2 >= sizeOfList ? i + 1 : i + 2;
    }
}

