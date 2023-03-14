package org.example.librarywithbooks;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LibraryTest {

    @Mock
    private Library library;

    public ArrayList<Book> setupBookList() {
        return new ArrayList<>(Arrays.asList(
                new Book("Amazing Maurice", 355),
                new Book("Treasure Island", 400),
                new Book("The Lion, The Witch and The Wardrobe", 600),
                new Book("Peter Pan", 450),
                new Book("Hungry Caterpillar", 15)));
    }

    @Test
    public void countTheNumberOfBooks_returnsBookListSize_whenBookListNotEmpty() {
        final int expected = 5;
        when(library.countTheNumberOfBooks()).thenReturn(expected);
        final int actual = library.countTheNumberOfBooks();
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void countTheNumberOfBooks_returnsBookListSize_whenBookListEmpty() {
        final int expected = 0;
        when(library.countTheNumberOfBooks()).thenReturn(expected);
        final int actual = library.countTheNumberOfBooks();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void findBookByTitle_returnBookObject_whenBookListContainsBookWithEnteredStringTitle() throws BookNotFoundException {

        library.setBooks(setupBookList());
        final Book expected = new Book("Treasure Island", 400);
        when(library.findBookByTitle("Treasure Island")).thenReturn(expected);
        final Book actual = library.findBookByTitle("Treasure Island");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void findBookByTitle_throwsBookNotFoundException_whenBookListDoesNotContainBookWithEnteredTitle() throws BookNotFoundException {

        library.setBooks(setupBookList());
        final BookNotFoundException expected = new BookNotFoundException("Sorry, but book with title Animal Farm has not been found");
        when(library.findBookByTitle("Animal Farm")).thenThrow(expected);
        assertThrows(BookNotFoundException.class, () -> library.findBookByTitle("Animal Farm"));
    }

    @Test
    public void findBookWithHighestPageCount_returnBookPageInt_whenBookListNotEmpty() throws BookNotFoundException {
        library.setBooks(setupBookList());
        final Book expected = new Book("The Lion, The Witch and The Wardrobe", 600);
        when(library.findBookWithHighestPageCount()).thenReturn(expected);
        final Book actual = library.findBookWithHighestPageCount();
        assertThat(library.findBookWithHighestPageCount()).isEqualTo(expected);
    }

    @Test
    public void findBookWithHighestPageCount_throwsBookNotFoundException_whenBookListEmpty() throws BookNotFoundException {
        library.setBooks(setupBookList());
        final BookNotFoundException expected = new BookNotFoundException("No books found");
        when(library.findBookWithHighestPageCount()).thenThrow(expected);
        assertThrows(BookNotFoundException.class, () -> library.findBookWithHighestPageCount());
    }

}
