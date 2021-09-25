package TimeConversion;

public class TimeConversion {
    public String timeConversion(String s) {

        String s2 = s.substring(0, 8);

        if (s.charAt(8) == 'A') {
            if (s.substring(0, 2).equals("12")) {
                return "00" + s2.substring(2);
            }
            return s2;
        } else {
            if (s.substring(0, 2) == "12") {
                return s2;
            } else {
                int hour12 = Integer.parseInt(s.substring(0, 2));
                int hour24 = hour12 + 12;
                return hour24 + s2.substring(2);
            }
        }
    }

}


