package week3;

public class Book {
    private String name;
    private String author;

    public Book(String title, String author) {
        this.name = title;
        this.author = author;
    }

    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
