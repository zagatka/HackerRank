package CyclicNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//zadanie z samouczka

public class Cyclic {
    public boolean isCyclic(String n) {
        List<Character> list = new ArrayList<>();
        Long number = Long.valueOf(n);
        List<String> cyclicList = new ArrayList<>();

        for (int i = 0; i < n.length(); i++) {
            list.add(n.charAt(i));
        }

        for (int i = 0; i < n.length(); i++) {
            list.add(list.get(0));
            list.remove(0);
            cyclicList.add(removeZeros(list.stream().map(String::valueOf).collect(Collectors.joining())));
        }

        for (int i = 1; i <= 6; i++) {
            Long temp = number * i;

            if (!cyclicList.contains(temp.toString())) {
                return false;
            }
        }

        return true;
    }

    public String removeZeros(String str) {
        while (str.charAt(0) == '0') {
            str = str.substring(1);
        }
        return str;
    }
}
