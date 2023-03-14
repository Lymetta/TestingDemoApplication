package org.example.librarywithbooks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Library {

    private ArrayList<Book> books;

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public int countTheNumberOfBooks() {
        return books.size();
    }

    public Book findBookByTitle(String bookTitle) throws BookNotFoundException {

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                return book;
            }
        }
        throw new BookNotFoundException("Sorry, but book with title " + bookTitle + " has not been found");
    }

    public Book findBookWithHighestPageCount() throws BookNotFoundException {
        if (books.size() > 0) {
            return books.stream().max(Comparator.comparing(Book::getNumberOfPages)).orElseThrow(NoSuchElementException::new);
        }
        throw new BookNotFoundException("No books found");
    }
}
