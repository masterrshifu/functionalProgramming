package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Functional02Collect {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,3,2,4,5,6,7,8,2);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        List<Integer> doubledNumbers = doubledList(numbers);
        System.out.println(doubledNumbers);

        List<Integer> coursesLength =
                courses.stream()
                        .map(x -> x.length())
                        .collect(Collectors.toList());

        System.out.println(coursesLength);
//        numbers.stream().distinct().forEach(System.out::println);

    }

    private static List<Integer> doubledList(List<Integer> numbers) {

        return numbers.stream()
                .map(number -> number*number)
                .collect(Collectors.toList());

    }


}
