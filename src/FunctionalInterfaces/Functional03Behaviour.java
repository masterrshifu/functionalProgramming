package FunctionalInterfaces;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Functional03Behaviour {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,3,2,4,5,6,7,8,2);

        filterAndPrint(numbers, x -> x % 2 == 0);
        filterAndPrint(numbers, x -> x % 2 != 0);

        List<Integer> squaredNumbers = mapAndCreateNewList(numbers, x -> x * x);
        List<Integer> cubedNumbers = mapAndCreateNewList(numbers, x -> x * x * x);
        List<Integer> doubledNumbers = mapAndCreateNewList(numbers, x -> x + x);

    }

    private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
        return numbers.stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
