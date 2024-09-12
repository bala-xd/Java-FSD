package day3.com.library;

public class Video extends MediaItem {
    private String director;
    private String genre;
    private int year;


    public Video(int id, String title, int noOfCopies, int runtime, String director, String genre, int year) {
        super(id, title, noOfCopies, runtime);
        this.director = director;
        this.genre = genre;
        this.year = year;
        addItem();
    }

    public Video() {
    }

    @Override
    public void addItem(){
        System.out.println("Video: " + getTitle() + " has been added!");
    }

    @Override
    public void print() {
        System.out.println("Video - ID: " + getId() + ", Title: " + getTitle() + 
        ", Director: " + director + ", Genre: " + genre + ", Year Released: " + year + 
        ", Runtime: " + getRuntime() + " minutes, Copies: " + getNoOfCopies());
    }

    @Override
    public void checkIn() {
        System.out.println("Checking in video: " + getTitle());
    }

    @Override
    public void checkOut() {
        System.out.println("Checking out video: " + getTitle());
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
