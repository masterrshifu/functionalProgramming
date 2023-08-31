package streams;

import java.util.Comparator;
import java.util.List;

public class Functional02Comparator {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,3,2,4,5,6,7,8,2);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
//        numbers.stream().sorted().forEach(System.out::println);
//        courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
//        courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        // sorted on the basis of length of the string
        courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);

    }


}
