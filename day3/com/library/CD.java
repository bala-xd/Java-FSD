package day3.com.library;

public class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(int id, String title, int noOfCopies, int runtime, String artist, String genre) {
        super(id, title, noOfCopies, runtime);
        this.artist = artist;
        this.genre = genre;
        addItem();
    }

    @Override
    public void addItem(){
        System.out.println("CD: " + getTitle() + " has been added!");
    }

    @Override
    public void checkIn() {
        System.out.println("Checking in CD: " + getTitle());
    }

    @Override
    public void checkOut() {
        System.out.println("Checking out CD: " + getTitle());
    }

    public void print() {
        System.out.println("CD - ID: " + getId() + ", Title: " + getTitle() + 
        ", Artist: " + artist + ", Genre: " + genre + ", Runtime: " + getRuntime() + 
        " minutes, Copies: " + getNoOfCopies());
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
