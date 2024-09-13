package day5_collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Object> hs = new HashSet<>(5);
        
        hs.add("JAVA");
        hs.add("Full Stack");
        hs.add(new MyOwnStudent(101, "bala"));
        hs.add(new MyOwnStudent(102, "siva"));
        hs.add(Integer.valueOf(23));
        hs.add(Integer.valueOf(18));
        hs.add(Integer.valueOf(33));

        //System.out.println(hs);
        Iterator<Object> hsIterator = hs.iterator();
        System.out.println("Printing the HashSet:");
        while (hsIterator.hasNext()) {
            Object element = hsIterator.next();
            System.out.println(
                String.format("%s Object: %s", 
                element.getClass().getSimpleName(), element));
        }
    }
}
