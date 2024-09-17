import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Object> hs = new HashSet<>(5);
        
        hs.add("JAVA");
        hs.add("Full Stack");
        hs.add(new MyOwnStudent("bala", 61));
        hs.add(new MyOwnStudent("siva", 90));
        hs.add(23);
        hs.add(18);
        hs.add(33);

        //System.out.println(hs);
        Iterator<Object> hsIterator = hs.iterator();
        System.out.println("Printing the HashSet:");
        while (hsIterator.hasNext()) {
            Object element = hsIterator.next();
            System.out.printf("%s Object: %s%n", element.getClass().getSimpleName(), element);
        }
    }
}
