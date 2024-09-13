package day5_collections;

public class MyOwnStudent {
    private int rollno;
    private String name;

    public MyOwnStudent(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    
    public MyOwnStudent() {
    }

    public int getRollno() {
        return this.rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "{" +
            " rollno='" + getRollno() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }

}
