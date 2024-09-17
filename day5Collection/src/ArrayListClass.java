import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>(5);
        
        al.add("JAVA");
        al.add("Full Stack");
        al.add(new MyOwnStudent("bala", 61));
        al.add(new MyOwnStudent("siva", 90));
        al.add(23);
        al.add(18);
        al.add(33);

        Iterator<Object> alIterator = al.iterator();
        System.out.println("Printing the ArrayList:");
        while (alIterator.hasNext()) {
            Object element = alIterator.next();
            System.out.printf("%s Object: %s%n", element.getClass().getSimpleName(), element);
        }
    }
}

