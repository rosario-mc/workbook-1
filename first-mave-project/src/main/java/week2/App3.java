package week2;

public class App3 {
    public static void main(String[] args) {
        Book2 myBook = new Book2("Java for Starters", "Maaike", 300);
        System.out.println(myBook.title);
        myBook.describe();

        Book2 b1 = new Book2("Book One" , "Alice" , 150);
        Book2 b2 = new Book2("Book Two" , "Bob" , 200);
        Book2 b3 = new Book2("Book Three" , "Charlie" , 300);

        b1.describe();
        b2.describe();
        b3.describe();

        Book2 mysteryBook = new Book2();
        mysteryBook.describe();
    }
}
