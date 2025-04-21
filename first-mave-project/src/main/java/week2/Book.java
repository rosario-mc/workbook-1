package week2;

public class Book {


    private String name;
    private int numberOfPages;
    private int numberOfPrevOwners;

    public String getNameBook() {
        return name;
    }
    public void setNameBook(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name. Name cannot be empty.");
        }
    }


    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPrevOwners() {
        return numberOfPrevOwners;
    }
    public void setNumberOfPrevOwners(int numberOfPrevOwners) {
        if (numberOfPrevOwners >= 0) {
            this.numberOfPrevOwners = numberOfPrevOwners;
        }

    }






}
