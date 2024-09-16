package day5_collection;

public class MyOwnStudent implements Comparable<MyOwnStudent> {
    private String name;
    private int marks;

    public MyOwnStudent(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    
    public MyOwnStudent() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return this.marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", marks='" + getMarks() + "'" +
            "}";
    }

    @Override
    public int compareTo(MyOwnStudent obj) {
        return obj.getMarks() - getMarks();
    }

}
