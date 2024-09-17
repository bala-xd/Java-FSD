import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>(5);
        
        al.add("JAVA");
        al.add("Full Stack");
        al.add(new MyOwnStudent("bala", 61));
        al.add(new MyOwnStudent("siva", 90));
        al.add(Integer.valueOf(23));
        al.add(Integer.valueOf(18));
        al.add(Integer.valueOf(33));

        Iterator<Object> alIterator = al.iterator();
        System.out.println("Printing the ArrayList:");
        while (alIterator.hasNext()) {
            Object element = alIterator.next();
            System.out.println(
                String.format("%s Object: %s", 
                element.getClass().getSimpleName(), element));
        }
    }
}

