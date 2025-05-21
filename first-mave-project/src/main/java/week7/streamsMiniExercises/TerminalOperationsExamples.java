package week7.streamsMiniExercises;

import java.util.ArrayList;
import java.util.List;

public class TerminalOperationsExamples {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(51);
        numbers.add(9);
        numbers.add(1);
        numbers.add(4);
        numbers.add(89);
        numbers.add(56);
        numbers.add(45);

        long count = numbers.stream()
                .filter(x -> x % 2 == 0)
                .count();
        System.out.println(count);
    }
}
