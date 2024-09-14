package day5_collections;

import java.util.*;

public class IntArrayList {

    public static int getMin(ArrayList<Integer> arr) {
        int min = 9999;
        int len = arr.size();
        for (int i = 0; i < len; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i<10; i++)
            nums.add(rand.nextInt(100));

        System.out.println("List elements are:\n" + nums);
        System.out.println("\nThe odd numbers are:");
        for (int i = 0; i<10; i++)
            if (nums.get(i)%2 == 1)
                System.err.println(nums.get(i));

        System.out.println("\nMin element: " + getMin(nums));

        nums.sort((num1, num2) -> (num2 - num1));

        //Collections.sort(nums, Collections.reverseOrder());

        System.out.println("\nList after sorting: " + nums);;
    }
}
