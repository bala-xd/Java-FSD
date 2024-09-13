package day5_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetClass {

    public static void concatSet(Set<String> s) {
        String result = "";
        Iterator<String> sIterator = s.iterator();

        System.out.println("\nResult of concatenating all of these strings together: ");
        while (sIterator.hasNext()) {
            result += sIterator.next() + " ";
        }
        System.out.println(result);
    }

    public static void printSet(Set<String> s) {
        Iterator<String> sIterator = s.iterator();

        System.out.println("Iterating over the Set:");
        while (sIterator.hasNext()) {
            System.out.println(sIterator.next());
        }
    }

    public static void floatSum(Set<Float> s) {
        float sum = 0;
        Iterator<Float> sIterator = s.iterator();

        System.out.println("Sum of the numbers in the set: ");
        while (sIterator.hasNext()) {
            sum += sIterator.next();
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Java");
        s.add("Spring-Boot");
        s.add("Docker");
        s.add("React");
        s.add("Redux");
        
        printSet(s); //Q1
        concatSet(s); //Q2

        s.clear();

        Set<Float> floatSet = new HashSet<>();
        floatSet.add(33.33f);
        floatSet.add(66.67f);
        floatSet.add(100.0f);

        floatSum(floatSet); //Q3
    }
}
