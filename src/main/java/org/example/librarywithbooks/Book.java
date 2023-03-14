package org.example.librarywithbooks;

import java.util.Objects;

public class Book {

    private final String title;
    private final int numberOfPages;

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getNumberOfPages() == book.getNumberOfPages() && Objects.equals(getTitle(), book.getTitle());
    }

}
