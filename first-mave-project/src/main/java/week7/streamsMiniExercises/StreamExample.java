package week7.streamsMiniExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(51);
        numbers.add(9);
        numbers.add(1);
        numbers.add(4);
        numbers.add(89);
        numbers.add(56);
        numbers.add(45);

        numbers.stream()
                .filter(x -> x % 2 == 0)
                //.forEach(x -> System.out.println(x)); the same as below
                .forEach(System.out::println);

        List<Integer> squaredEvens = numbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .toList();

        System.out.println("Squared even numbers: " + squaredEvens);
    }
}
