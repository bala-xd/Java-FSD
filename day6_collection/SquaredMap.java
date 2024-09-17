package day6_collection;

import java.util.HashMap;

public class SquaredMap {

    public static HashMap<Integer, Integer> getSquares(int[] arr) {
        HashMap<Integer, Integer> squareMap = new HashMap<>();
        for (int num: arr)
            squareMap.put(num, num * num);
        return squareMap;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        HashMap<Integer, Integer> result = getSquares(numbers);
        System.out.println(result);
    }
}
