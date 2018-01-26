package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;
import stream.book.Book;
import stream.book.BookDirectory;

import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    @Test
    public void testGetListUsingIntStream() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .count();
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }
}
