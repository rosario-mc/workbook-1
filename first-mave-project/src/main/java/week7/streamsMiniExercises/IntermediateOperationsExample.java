package week7.streamsMiniExercises;

import java.util.ArrayList;
import java.util.List;

public class IntermediateOperationsExample {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        text.add("Turtle");
        text.add("Dog");
        text.add("Snake");
        text.add("Toucan");
        text.add("Reptile");
        text.add("Komodo Dragon");
        text.add("Cat");

        List<String> stringListAfterStream = text.stream()
                .filter(s -> s.length() > 6)
                //SAME AS BELOW CODE
                //.map(s -> s.toUpperCase())
                //.peek(s -> System.out.println(s))
                .map(String::toUpperCase)
                .peek(System.out::println)
                .toList();
    }
}
