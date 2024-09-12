package day3.com.library;

public class JournalPaper extends WrittenItem {
    private int year;

    public JournalPaper(int id, String title, int noOfCopies, String author, int year) {
        super(id, title, noOfCopies, author);
        this.year = year;
        addItem();
    }

    @Override
    public void addItem(){
        System.out.println("Journal Paper: " + getTitle() + " has been added!");
    }

    @Override
    public void print() {
        System.out.println("Journal Paper - ID: " + getId() + ", Title: " + getTitle() + 
        ", Author: " + getAuthor() + ", Year Published: " + year + 
        ", Copies: " + getNoOfCopies());
    }

    @Override
    public void checkIn() {
        System.out.println("Checking in journal paper: " + getTitle());
    }

    @Override
    public void checkOut() {
        System.out.println("Checking out journal paper: " + getTitle());
    }

    public JournalPaper() {
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
