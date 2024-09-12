package day3.com.library;

public abstract class Item {
    private int id;
    private String title;
    private int noOfCopies;


    public Item(int id, String title, int noOfCopies) {
        this.id = id;
        this.title = title;
        this.noOfCopies = noOfCopies;
    }


    public Item() {
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNoOfCopies() {
        return this.noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }
    
    public abstract void checkIn();

    public abstract void checkOut();

    public abstract void addItem();

    public abstract void print();

    @Override
    public boolean equals(Object obj){
        if (obj == null || getClass() != obj.getClass()) 
            return false;
        return (getTitle() == ((Item)obj).getTitle());
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", noOfCopies='" + getNoOfCopies() + "'" +
            "}";
    }

}
