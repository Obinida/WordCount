package main.java;

public class Main {
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();

        String sample = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras iaculis nibh augue, ac maximus risus blandit a. Integer bibendum enim ac lacinia dignissim. Mauris et volutpat magna. Sed sit amet urna pharetra, elementum odio vel, interdum elit. Fusce rhoncus, nibh vitae iaculis interdum, risus sem porta mi, a iaculis felis elit sit amet eros. Sed sit amet purus eget libero egestas congue nec in enim. Aenean vitae tortor mauris. Nullam non turpis id leo tincidunt blandit sit amet sit amet ipsum. In hac habitasse platea dictumst. Nunc commodo pellentesque urna non consectetur. Duis nisi enim, imperdiet vitae mollis at, sodales eu magna. Interdum et malesuada fames ac ante ipsum primis in faucibus.";
        String word = "et";
        int digit = 6;

        System.out.println("Sample text: " + sample);
        System.out.println("Highest frequency: " + wordCounter.calculateHighestFrequency(sample));
        System.out.println("Frequency for word '" + word + "': " + wordCounter.calculateFrequencyForWord(sample, word));
        System.out.println("Top " + digit + " words with frequency: " + wordCounter.calculateMostFrequentNWords(sample, digit));
    }
}