package tw.kata.lijun;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.function.Predicate;

public class CollectionUtil {
    public static List<Integer> getOdds(List<Integer> numberList) {
        return filterNumbers(numberList, number -> !isEven(number));
    }

    public static List<Integer> getEvens(List<Integer> numberList) {
        return filterNumbers(numberList, number -> isEven(number));
    }

    public static List<Integer> doubleEvens(List<Integer> numberList) {
        return numberList.stream().map(number -> doubleEven(number)).collect(toList());
    }

    private static int doubleEven(Integer number) {
        return isEven(number) ? 2 * number : number;
    }

    private static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    private static List<Integer> filterNumbers(List<Integer> numberList, Predicate<Integer> evenPredicate) {
        return numberList.stream().filter(num -> evenPredicate.test(num)).collect(toList());
    }
}
