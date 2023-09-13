package FunctionalInterfaces;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Functional03Supplier {

    public static void main(String[] args) {

        /*List<Integer> numbers = List.of(1,2,3,4,3,2,4,5,6,7,8,2);


        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

        Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return  x % 2 == 0;
            }
        };

        Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };

        Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer x) {
                System.out.println(x);
            }
        };



        Function<Integer, Integer> squareFunction = x -> x * x;
        Consumer<Integer> sysoutConsumer = System.out::println;
        numbers.stream()
                .filter(isEvenPredicate)
                .map(squareFunction)
                .forEach(sysoutConsumer);

        BinaryOperator<Integer> sumBinaryOperator = Integer::sum;

        BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer x, Integer y) {
                return x+y;
            }
        };

        int sum = numbers.stream()
                .reduce(0, sumBinaryOperator);*/


        // No input > return something

        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };
        System.out.println(randomIntegerSupplier.get());


        //UnaryOperator

        UnaryOperator<Integer> unaryOperator = (x) -> 3*x;
        System.out.println(unaryOperator.apply(10));
        
    }
}
