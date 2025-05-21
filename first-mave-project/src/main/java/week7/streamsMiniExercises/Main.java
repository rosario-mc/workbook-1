package week7.streamsMiniExercises;

import java.util.function.DoubleBinaryOperator;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 10, 13, 20};

        NumberTester isEven = number -> number % 2 == 0;

        System.out.println("2 is even? " + isEven.test(2));
        System.out.println("5 is even? " + isEven.test(5));
        System.out.println("10 is even? " + isEven.test(10));
        System.out.println("13 is even? " + isEven.test(13));
        System.out.println("20 is even? " + isEven.test(20));

        DoubleBinaryOperator multiply = (a,b) -> a * b;
        System.out.println("DoubleBinaryOperator Result: " + multiply.applyAsDouble(4.5, 3.2));

        NameCombiner combiner = ((firstName, lastName) -> firstName + " " + lastName);
        System.out.println(combiner.combine("Rosario", "Miller-Canales"));
    }
}