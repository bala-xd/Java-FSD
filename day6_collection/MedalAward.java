package day6_collection;

import java.util.HashMap;
import java.util.Map;

public class MedalAward {

    public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> studentMarks) {
        HashMap<Integer, String> medalList = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : studentMarks.entrySet()) {
            int marks = entry.getValue();
            if (marks >= 90) {
                medalList.put(entry.getKey(), "Gold");
            } else if (marks >= 80) {
                medalList.put(entry.getKey(), "Silver");
            } else if (marks >= 70) {
                medalList.put(entry.getKey(), "Bronze");
            }
        }
        
        return medalList;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> studentMarks = new HashMap<>();
        
        studentMarks.put(101, 95);
        studentMarks.put(102, 82);
        studentMarks.put(103, 75);
        studentMarks.put(104, 60);
        studentMarks.put(105, 88);
        
        HashMap<Integer, String> medalList = MedalAward.getStudents(studentMarks);
        
        for (Integer regNo : medalList.keySet()) {
            System.out.println("Reg No: " + regNo + ", Medal: " + medalList.get(regNo));
        }
    }
}

