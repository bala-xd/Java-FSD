package day5_collections;

import java.util.*;

public class SortStudents {
    public static void main(String[] args) {
        ArrayList<MyOwnStudent> students = new ArrayList<>();

        students.add(new MyOwnStudent("bala", 71));
        students.add(new MyOwnStudent("siva", 89));
        students.add(new MyOwnStudent("Neha", 78));
        students.add(new MyOwnStudent("Arjun", 88));
        students.add(new MyOwnStudent("Priya", 90));
        students.add(new MyOwnStudent("Vijay", 76));
        students.add(new MyOwnStudent("Sneha", 84));
        students.add(new MyOwnStudent("Rajesh", 82));
        students.add(new MyOwnStudent("Kavya", 91));
        students.add(new MyOwnStudent("Rohan", 79));

        //Collections.sort(students);
        students.sort(MyOwnStudent::compareTo);

        System.out.println("Printing top 3 students based on their marks: ");
        for (int i=0; i<3; i++)
            System.out.println(students.get(i));
    }
}
