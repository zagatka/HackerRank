package CountingValleys;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        char[] tab = path.toCharArray();
        int hight = 0;
        int valleys = 0;

        for (int i = 0; i < tab.length; i++) {

            if (hight == 0 && tab[i] == 'D') {
                valleys++;
            }

            if (tab[i] == 'D') {
                hight--;
            } else {
                hight++;
            }
        }
        return valleys;
    }

}
