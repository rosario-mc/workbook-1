package week2;

public class bApp {
    public static void main(String[] args) {
        Book b = new Book();

        b.setNameBook("Harry Potter and the Sorcerer's Stone");
        b.setNumberOfPages(56);
        b.setNumberOfPrevOwners(2);

        System.out.println("The book I am currently reading is called " + b.getNameBook() + ". I have " + b.getNumberOfPages() + " pages left to read. I am the " + b.getNumberOfPrevOwners() + " owner of this book." );
    }
}
