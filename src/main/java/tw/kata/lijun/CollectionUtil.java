package tw.kata.lijun;

import static java.util.stream.Collectors.toList;

import java.util.List;

public class CollectionUtil {
    public static List<Integer> getOdds(List<Integer> numberList) {
        return numberList.stream().filter(num -> num % 2 != 0).collect(toList());
    }

    public static List<Integer> getEvens(List<Integer> numberList) {
        return numberList.stream().filter(i -> i % 2 == 0).collect(toList());
    }
}
