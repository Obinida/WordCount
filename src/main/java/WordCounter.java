package main.java;

import java.util.*;

public class WordCounter implements WordFrequencyAnalyzer {

    @Override
    public int calculateHighestFrequency(String text) {
        String[] words = textToStringArray(text);
        int maxFreq = 0;

        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (temp.equalsIgnoreCase(words[j]))
                    count++;
            }
            if (maxFreq < count) {
                maxFreq = count;
            }
        }
        return maxFreq;
    }

    @Override
    public int calculateFrequencyForWord(String text, String word) {
        String[] words = textToStringArray(text);
        int count = 0;

        for (String w : words) {
            if (word.equals(w))
                count++;
        }
        return count;
    }

    @Override
    public List<WordFrequency> calculateMostFrequentNWords(String text, int n) {
        String[] words = textToStringArray(text);
        TreeMap<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        List<Map.Entry<String, Integer>> sortedMap = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).toList();
        List<WordFrequency> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Map.Entry<String, Integer> temp = sortedMap.get(i);
            list.add(new Word(temp.getKey(), temp.getValue()));
        }
        return list;
    }

    private String[] textToStringArray(String text) {
        return text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
    }
}
