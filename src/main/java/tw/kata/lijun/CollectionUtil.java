package tw.kata.lijun;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class CollectionUtil {
    public static List<Integer> getOdds(List<Integer> numberList) {
        return numberList.stream().filter(num -> num % 2 != 0).collect(toList());
    }
}
