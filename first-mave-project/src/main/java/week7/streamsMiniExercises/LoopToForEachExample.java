package week7.streamsMiniExercises;

import java.util.ArrayList;
import java.util.List;

public class LoopToForEachExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");

        //strings.forEach(s -> System.out.println(s)); THE SAME AS BELOW
        strings.forEach(System.out::println);
    }
}
