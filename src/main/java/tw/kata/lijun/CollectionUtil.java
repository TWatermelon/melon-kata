package tw.kata.lijun;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtil {
    public static List<Integer> getOdds(List<Integer> numberList) {
        return numberList.stream().filter(num -> num % 2 != 0).collect(toList());
    }

    public static List<Integer> getEvens(List<Integer> numberList) {
        List<Integer> evenList = new ArrayList<Integer>();
        for (Integer i : numberList) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }
        return evenList;
    }
}
