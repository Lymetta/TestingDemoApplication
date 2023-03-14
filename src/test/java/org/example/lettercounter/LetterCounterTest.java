package org.example.lettercounter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LetterCounterTest {

    @Test
    public void countCharsInString_shouldReturnCorrectNumberOfChars_inCapitalizedSingleWord() {
        final int actual = LetterCounter.countCharsInString('s', "Sandra");
        final int expected = 1;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void countCharsInString_shouldReturnCorrectNumberOfChars_inCapitalizedSentence() {
        final int actual = LetterCounter.countCharsInString('m', "Hello there, my name is Sandra");
        final int expected = 2;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void countCharsInString_shouldReturnCorrectNumberOfChars_inStringWithoutThatChar() {
        final int actual = LetterCounter.countCharsInString('z', "Hello there, my name is Sandra");
        final int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }
}
