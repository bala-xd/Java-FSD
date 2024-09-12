package day3.com.library;

public class LibraryMain {
    public static void main(String[] args) {
        Book book = new Book(1, "To Kill a Mockingbird", 3, "Harper Lee");
        JournalPaper journal = new JournalPaper(2, "Quantum Mechanics", 5, "Richard Feynman", 1965);
        Video video = new Video(3, "Inception", 2, 148, "Christopher Nolan", "Sci-Fi", 2010);
        CD cd = new CD(4, "Abbey Road", 4, 47, "The Beatles", "Rock");
        //Book book2 = new Book(5, "To Kill a Mockingbird", 5, "Harper Lee");
        CD cd2 = new CD(6, "To Kill a Mockingbird", 4, 47, "The Beatles", "Rock");

        System.err.println();
        book.print();
        book.checkIn();
        book.checkOut();

        System.err.println();
        journal.print();
        journal.checkIn();
        journal.checkOut();

        System.err.println();
        video.print();
        video.checkIn();
        video.checkOut();

        System.err.println();
        cd.print();
        cd.checkIn();
        cd.checkOut();

        if (book.equals(cd2)){
            System.err.println("\nThe items are same!");
        }
        else {
            System.err.println("\nThe items are not same!");
        }
    }
}
