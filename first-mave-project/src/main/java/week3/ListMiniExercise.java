package week3;

import java.util.ArrayList;
import java.util.List;

public class ListMiniExercise {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Dogs");
        animals.add("Reptiles");
        animals.add("Birds");
        printAnimalList(animals);

        animals.remove(2);
        animals.add("Fish");
        printAnimalList(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(16);
        numbers.add(12);
        numbers.add(1);
        printNumberList(numbers);

        numbers.remove(0);
        numbers.add(21);
        printNumberList(numbers);

        List<Book> books = new ArrayList<>();
        //Book b1 = new Book("Harry Potter Series", "J.K. Rowling");
        books.add(new Book("Harry Potter Series", "J.K. Rowling"));
        books.add(new Book("Twilight Saga", "Stephenie Meyer"));
        books.add(new Book("Hunger Games Series", "Suzanne Collins"));

        printBookList(books);

        books.remove(1);
        books.add(new Book("Chronicles of Narnia", "C.S. Lewis"));
        printBookList(books);


    }
    public static void printAnimalList(List <String> stringList){
        for(int i = 0; i < stringList.size(); i++){
            System.out.println("Animal " + (i + 1) + ": " + stringList.get(i));
        }
    }

    public static void printNumberList(List <Integer> intergerList){
        for(int i = 0; i < intergerList.size(); i++){
            System.out.println("Number " + (i + 1) + ": " + intergerList.get(i));
        }
    }

    public static void printBookList(List <Book> bookList){
        for(int i = 0; i < bookList.size(); i++){
            Book book = bookList.get(i);
            System.out.println("Book " + (i + 1) + ": " + book.getTitle() + " by " + book.getAuthor());
        }
    }

}
