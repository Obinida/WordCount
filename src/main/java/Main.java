package main.java;

public class Main {
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();

        String sample = "The sun shines over the lake";
        String word = "sun";
        int digit = 3;

        System.out.println("Sample text: " + sample);
        System.out.println("Highest frequency: " + wordCounter.calculateHighestFrequency(sample));
        System.out.println("Frequency for word '" + word + "': " + wordCounter.calculateFrequencyForWord(sample, word));
        System.out.println("Top " + digit + " words with frequency: " + wordCounter.calculateMostFrequentNWords(sample, digit));
    }
}