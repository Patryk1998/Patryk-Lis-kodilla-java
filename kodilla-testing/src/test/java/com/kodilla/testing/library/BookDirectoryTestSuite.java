package com.kodilla.testing.library;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int bookQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int i = 0; i < bookQuantity; i++) {
            Book book = new Book("Title #" + i, "Author" + i, 2000 + i);
            resultList.add(book);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());

    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf10Books = generateListOfNBooks(10);
            when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                    .thenReturn(resultListOf10Books);

            // When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

            // Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }
    @Test
    public void  listBooksInHandsOfNoBooks(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser tom = new LibraryUser("Name", "LastName", "12123123");
        List<Book> noBook = new ArrayList<Book>();
        when(libraryDatabase.listBooksInHandsOf(tom)).thenReturn(noBook);
        //When
        List<Book> rentBooks = bookLibrary.listBooksInHandsOf(tom);
        //Then
        assertEquals(0, rentBooks.size());

    }

    @Test
    public void  listBooksInHandsOfOneBook(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser tom = new LibraryUser("Name", "LastName", "12123123");
        List<Book> oneBook = generateListOfNBooks(1);
        when(libraryDatabase.listBooksInHandsOf(tom)).thenReturn(oneBook);
        //When
        List<Book> rentBooks = bookLibrary.listBooksInHandsOf(tom);
        //Then
        assertEquals(1, rentBooks.size());
    }

    @Test
    public void  listBooksInHandsOf5Books(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser tom = new LibraryUser("Name", "LastName", "12123123");
        List<Book> fiveBooks = generateListOfNBooks(5);
        when(libraryDatabase.listBooksInHandsOf(tom)).thenReturn(fiveBooks);
        //When
        List<Book> rentBooks = bookLibrary.listBooksInHandsOf(tom);
        //Then
        assertEquals(5, rentBooks.size());
    }
    }




