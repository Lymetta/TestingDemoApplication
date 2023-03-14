package org.example.lettercounter;

public class LetterCounter {

    public static int countCharsInString(char character, String aString) {

        return (int) aString.toLowerCase().chars().filter(c -> c == character).count();
    }
}
