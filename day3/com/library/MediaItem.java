package day3.com.library;

public abstract class MediaItem extends Item {

    private int runtime;


    public MediaItem(int id, String title, int noOfCopies, int runtime) {
        super(id, title, noOfCopies);
        this.runtime = runtime;
    }


    public MediaItem() {
    }


    public int getRuntime() {
        return this.runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

}
