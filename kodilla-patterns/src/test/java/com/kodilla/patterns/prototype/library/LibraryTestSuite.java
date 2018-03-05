package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public  void testGetBooks() {
        //Given
        Library adventureBooks = new Library("ADVENTURE BOOKS");
        Book book1 = new Book("Adventure book #1", "Author #1", LocalDate.of(2000, 12,12));
        Book book2 = new Book("Adventure book #2", "Author #2", LocalDate.of(2010, 8,14));
        Book book3 = new Book("Adventure book #3", "Author #3", LocalDate.of(2003, 5,9));
        Book book4 = new Book("Adventure book #4", "Author #4", LocalDate.of(1999, 2,19));
        Book book5 = new Book("Adventure book #5", "Author #5", LocalDate.of(1989, 3,22));
        //When
        adventureBooks.getBooks().add(book1);
        adventureBooks.getBooks().add(book2);
        adventureBooks.getBooks().add(book3);
        adventureBooks.getBooks().add(book4);
        adventureBooks.getBooks().add(book5);

        Library clonedLibrary = null;
        try {
            clonedLibrary = adventureBooks.shallowCopy();
            clonedLibrary.setName("COPIED LIBRARY #1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = adventureBooks.deepCopy();
            deepClonedLibrary.setName("COPIED lIBRARY #2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //Then
        Assert.assertEquals(5, adventureBooks.getBooks().size());
        Assert.assertEquals(5, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        deepClonedLibrary.getBooks().remove(book1);
        Assert.assertNotEquals(adventureBooks.getBooks().size(), deepClonedLibrary.getBooks().size());




    }
}
