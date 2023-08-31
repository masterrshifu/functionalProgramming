package streams;

import java.util.List;

public class Functional02 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,5,4,3,2,6,33,23);

//        0 12
//        12 5
//        17 4
//        21 3
//        24 2
//        26 6
//        32 33
//        65 23


        int sum = addListFunctional(numbers);
        System.out.println(sum);

    }

//    private static int sum(int a, int b) {
        private static int sum(int aggregate, int nextNumber) {
        System.out.println(aggregate + " " + nextNumber);
        return aggregate + nextNumber;
    }

    private static int addListFunctional(List<Integer> numbers) {

        // (a,b) -> a + b
//        return numbers.stream()
//                .reduce(0, Functional02::sum);


        // using lambdas
        return numbers.stream()
//                .reduce(0, (x,y) -> x + y);
                .reduce(0, Integer::sum); // utilizing method from Integer class itself
    }


}
