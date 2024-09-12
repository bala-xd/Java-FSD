package day3.com.library;

public abstract class WrittenItem extends Item {

    private String author;
    

    public WrittenItem(int id, String title, int noOfCopies, String author) {
        super(id, title, noOfCopies);
        this.author = author;
    }

    public WrittenItem() {
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
