package test.java;

import main.java.ReadFile;
import main.java.Word;
import main.java.WordCounter;
import main.java.WordFrequency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {
    WordCounter wordCounter;
    String text;
    String textWithRandomCase;
    String textWithMultipleSpaces;

    @BeforeEach
    private void setup() {
        wordCounter = new WordCounter();
        text = ReadFile.getString("src/test/resources/text.txt");
        textWithRandomCase = ReadFile.getString("src/test/resources/text_with_random_case.txt");
        textWithMultipleSpaces = ReadFile.getString("src/test/resources/text_with_multiple_spaces.txt");
    }

    @Test
    public void calculateHighestFrequencyInGivenText() {
        assertEquals(4, wordCounter.calculateHighestFrequency(text));
        assertEquals(4, wordCounter.calculateHighestFrequency(textWithRandomCase));
        assertEquals(4, wordCounter.calculateHighestFrequency(textWithMultipleSpaces));
    }

    @Test
    public void calculateHighestFrequencyForWordInGivenText() {
        String word = "eleifend";
        assertEquals(2, wordCounter.calculateFrequencyForWord(text, word));
        assertEquals(2, wordCounter.calculateFrequencyForWord(textWithRandomCase, word));
        assertEquals(2, wordCounter.calculateFrequencyForWord(textWithMultipleSpaces, word));
    }

    @Test
    public void calculateHighestFrequencyForWordsInGivenTextAndReturnGivenAmount() {
        int amount = 8;
        List<WordFrequency> expected = new ArrayList<>();
        expected.add(new Word("in", 4));
        expected.add(new Word("sed", 4));
        expected.add(new Word("at", 3));
        expected.add(new Word("dolor", 3));
        expected.add(new Word("lorem", 3));
        expected.add(new Word("malesuada", 3));
        expected.add(new Word("neque", 3));
        expected.add(new Word("vulputate", 3));
        assertEquals(expected, wordCounter.calculateMostFrequentNWords(text, amount));
        assertEquals(expected, wordCounter.calculateMostFrequentNWords(textWithRandomCase, amount));
        assertEquals(expected, wordCounter.calculateMostFrequentNWords(textWithMultipleSpaces, amount));
    }
}
