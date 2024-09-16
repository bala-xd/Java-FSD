package day5_collections;

import java.util.*;

public class TopFrequentWords {
    public static void printTopNFrequentWords(List<String> words, int N) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        
        System.out.println("Top " + N + " most frequent words:");
        for (int i = 0; i < N && i < sortedEntries.size(); i++) {
            Map.Entry<String, Integer> entry = sortedEntries.get(i);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    static class WordFrequency {
        String word;
        int frequency;

        WordFrequency(String word, int frequency) {
            this.word = word;
            this.frequency = frequency;
        }
    }
    
    public static void printTopNFrequentWordsList(List<String> words, int N) {
        List<WordFrequency> wordFrequencies = new ArrayList<>();
        
        for (String word : words) {
            boolean found = false;
            for (WordFrequency wf : wordFrequencies) {
                if (wf.word.equals(word)) {
                    wf.frequency++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                wordFrequencies.add(new WordFrequency(word, 1));
            }
        }
        
        wordFrequencies.sort((wf1, wf2) -> Integer.compare(wf2.frequency, wf1.frequency));
        
        System.out.println("Top " + N + " most frequent words:");
        for (int i = 0; i < N && i < wordFrequencies.size(); i++) {
            WordFrequency wf = wordFrequencies.get(i);
            System.out.println(wf.word + ": " + wf.frequency);
        }
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
            "apple", "banana", "apple", "apple", "orange",
            "banana", "banana", "kiwi", "kiwi", "kiwi",
            "pear", "banana", "orange", "pear", "kiwi"
        );
        
        printTopNFrequentWords(words, 3);
    }
}
