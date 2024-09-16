package day6_collection;

import java.util.*;

public class SortHashMapValues {

    public static ArrayList<Integer> getValues(HashMap<String, Integer> hs) {
        ArrayList<Integer> values = new ArrayList<>(hs.values());
        values.sort((val1, val2) -> Integer.compare(val1, val2));
        return values;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        
        studentMarks.put("S001", 85);
        studentMarks.put("S002", 92);
        studentMarks.put("S003", 78);
        studentMarks.put("S004", 88);
        studentMarks.put("S005", 95);
        studentMarks.put("S006", 80);
        studentMarks.put("S007", 90);
        studentMarks.put("S008", 82);
        studentMarks.put("S009", 76);
        studentMarks.put("S010", 89);

        System.out.println(getValues(studentMarks));
    }
}
