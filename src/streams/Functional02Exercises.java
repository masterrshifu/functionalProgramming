package streams;

import java.util.List;

public class Functional02Exercises {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3);
        System.out.println(calculateSumOfSquaresOfAllNumbers(numbers));
        System.out.println(sumOfOddNumbersInList(numbers));


    }

    private static int sumOfOddNumbersInList(List<Integer> numbers) {
        return numbers.stream()
                .filter( x -> x%2 != 0)
                .reduce(0, Integer::sum);
    }

    private static int calculateSumOfSquaresOfAllNumbers(List<Integer> numbers) {

        return numbers.stream()
                .map( x -> x*x)
                .reduce(0, (x,y) -> x+y);
    }


}
