package day6_collection;

import java.util.HashMap;
import java.util.Map;

public class CountChar {
    
    public static Map<Character, Integer> countChars(char[] arr) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char a: arr) {
            if (freqMap.containsKey(a))
                freqMap.put(a, freqMap.get(a) + 1);
            else
                freqMap.put(a, 1);
        }
        return freqMap;
    }
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'a', 'c', 'b', 'a'};

        Map<Character, Integer> charCountMap = countChars(arr);

        System.out.println(charCountMap);
    }
}
