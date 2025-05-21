package week7.lambdasExercises;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
