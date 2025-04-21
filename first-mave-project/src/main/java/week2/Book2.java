package week2;

public class Book2 {
    String title;
    String author;
    int pages;

    public Book2 (String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void describe(){
        System.out.println("This book is " + title + " by " + author + " with " + pages + " pages.");
    }

    public Book2() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.pages = 0;
    }


}
