package streams;

import java.util.List;

public class Functional02Distinct {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,3,2,4,5,6,7,8,2);
        numbers.stream().distinct().forEach(System.out::println);

    }


}
