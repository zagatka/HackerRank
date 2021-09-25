package RepeatingString;

class Result {

    public static long repeatedString(String s, long n) {
        long counter = 0;

        if (s.length() > n) {
            String s2 = s.substring(0, (int) n);
            counter = howManyA(s2);
        } else {
            if (n % s.length() != 0) {
                String s2 = s.substring(0, (int) (n % s.length()));
                counter = (howManyA(s) * (n / s.length())) + howManyA(s2);
            } else {
                counter = howManyA(s) * (n / s.length());
            }
        }
        return counter;
    }

    private static long howManyA(String s) {
        char[] tab = s.toCharArray();
        long counter = 0;
        for (char el : tab) {
            if (el == 'a') {
                counter++;
            }
        }
        return counter;
    }

}
