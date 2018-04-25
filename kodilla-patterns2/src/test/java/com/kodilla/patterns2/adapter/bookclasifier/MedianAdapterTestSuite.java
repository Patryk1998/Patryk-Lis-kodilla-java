package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Author", "Title", 2005, "123");
        Book book2 = new Book("Author", "Title", 2000, "123");
        Book book3 = new Book("Author", "Title", 1995, "123");
        Book book4 = new Book("Author", "Title", 1990, "123");
        Book book5 = new Book("Author", "Title", 2010, "123");
        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        Assert.assertEquals(2000, median);
    }
}
