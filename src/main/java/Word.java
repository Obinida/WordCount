package main.java;

public class Word implements WordFrequency {
    private final String word;
    private final int frequency;

    public Word(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    @Override
    public String getWord() {
        return word;
    }

    @Override
    public int getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "('" + word + "', " + frequency + ")";
    }
}
