package tw.kata.lijun;

import static java.lang.String.format;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.function.Predicate;

public class CollectionUtil {
    public static List<Integer> getOdds(List<Integer> numbers) {
        return filterNumbers(numbers, number -> !isEven(number));
    }

    public static List<Integer> getEvens(List<Integer> numbers) {
        return filterNumbers(numbers, number -> isEven(number));
    }

    public static List<Integer> doubleEvens(List<Integer> numbers) {
        return numbers.stream().map(number -> doubleEven(number)).collect(toList());
    }

    public static String findNumber(List<Integer> numbers, int toBeFound) {
        return numbers.stream().anyMatch(number -> number == toBeFound) ?
                format("Hello, %s", toBeFound) : "Not Found";
    }

    private static int doubleEven(Integer number) {
        return isEven(number) ? 2 * number : number;
    }

    private static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    private static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers.stream().filter(num -> predicate.test(num)).collect(toList());
    }
}
