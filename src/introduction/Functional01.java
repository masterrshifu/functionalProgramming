package introduction;

import java.util.List;
import java.util.function.Function;

public class Functional01 {

    public static void main(String[] args) {

        printAllNumbersInListFunctional(List.of(12, 9, 2, 3, 43, 54, 67, 76));
        printEvenNumbersInListFunctional(List.of(12, 9, 2, 3, 43, 54, 67, 76));
        printAllCoursesInListFunctional(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"));
        printSquaresOfEvenNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        printCubeOfOddNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        printCharacterLengthOfAllCourses(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"));
    }

    private static void printCharacterLengthOfAllCourses(List<String> courses) {

        courses.stream()
                .map(course -> course + "  " + course.length())
                .forEach(System.out::println);

    }

    private static void printCubeOfOddNumbers(List<Integer> integers) {

        integers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }


    private static void printSquaresOfEvenNumbers(List<Integer> integers) {

        integers.stream()
                .filter((number -> number % 2 == 0))
                .map(number -> number * number)
                .forEach(System.out::println);

    }

    private static void printAllCoursesInListFunctional(List<String> courses) {

        // printing all the course
        courses.stream()
                .forEach(System.out::println);

        // printing all courses with Spring keyword
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);

        // printing courses with atleast 4 characters
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);

    }

    private void print(int number) {
        System.out.println(number);
    }


    private static void printAllNumbersInListFunctional(List<Integer> integers) {

        // creating a stream and using a method reference
        integers.stream()
                .forEach(new Functional01()::print);

    }

    private static void printEvenNumbersInListFunctional(List<Integer> integers) {

        // Filter - Only allow Even Numbers
        integers.stream()
//                .filter(Functional01::isEven)
                // is there a simple to create a filter without using a method
                // yes, lambda expression
                .filter(number -> number % 2 == 0) // Lambda expression
                .forEach(System.out::println); // Method Reference


    }

}
