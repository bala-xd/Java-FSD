package day5_collection;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        LinkedHashSet<Object> lhs = new LinkedHashSet<>(5);
        
        lhs.add("JAVA");
        lhs.add("Full Stack");
        lhs.add(new MyOwnStudent("bala", 61));
        lhs.add(new MyOwnStudent("siva", 90));
        lhs.add(Integer.valueOf(23));
        lhs.add(Integer.valueOf(18));
        lhs.add(Integer.valueOf(33));

        Iterator<Object> lhsIterator = lhs.iterator();
        System.out.println("Printing the LinkedHashSet:");
        while (lhsIterator.hasNext()) {
            Object element = lhsIterator.next();
            System.out.println(
                String.format("%s Object: %s", 
                element.getClass().getSimpleName(), element));
        }
    }
}
