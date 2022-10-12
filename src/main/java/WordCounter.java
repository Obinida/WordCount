package main.java;

import java.util.List;

public class WordCounter implements WordFrequencyAnalyzer {

    @Override
    public int calculateHighestFrequency(String text) {
        return 0;
    }

    @Override
    public int calculateFrequencyForWord(String text, String word) {
        return 0;
    }

    @Override
    public List<WordFrequency> calculateMostFrequentNWords(String text, int n) {
        return null;
    }
}
