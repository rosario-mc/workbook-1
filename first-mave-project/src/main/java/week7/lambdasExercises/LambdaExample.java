package week7.lambdasExercises;

public class LambdaExample {
    public static void main(String[] args) {
        NumericOperator add = (a, b) -> a + b;
        System.out.println(add.operate(5, 4));

        NumericOperator find = (a, b) -> Math.max(a, b);
        System.out.println(find.operate(65, 84));

        StringFormatter text = (s) -> s.toUpperCase();
        System.out.println(text.format("hello world!"));

        UnaryOperator square = (a) -> (int) Math.pow(a, 2);
        System.out.println(square.apply(5));

        TriFunction average = (a, b, c) -> (a + b + c) / 3.0;
        System.out.println(average.apply(5, 4, 5));

        Printer print = (s) -> System.out.println("Print text: " + s);
        print.printer("This is the text I added.");

        Predicate<String> test = (s) -> s.isEmpty();
        System.out.println(test.test("hi"));
        System.out.println(test.test(""));
    }
}
