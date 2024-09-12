package day3.com.library;

public class Book extends WrittenItem {
    
    public Book(int id, String title, int noOfCopies, String author) {
        super(id, title, noOfCopies, author);
        addItem();
    }

    public void addItem(){
        System.out.println("Book: " + getTitle() + " has been added!");
    }

    @Override
    public void print() {
        System.out.println("Book - ID: " + getId() + ", Title: " + getTitle() + 
        ", Author: " + getAuthor() + ", Copies: " + getNoOfCopies());
    }

    @Override
    public void checkIn() {
        System.out.println("Checking in book: " + getTitle());
    }

    @Override
    public void checkOut() {
        System.out.println("Checking out book: " + getTitle());
    }
}
