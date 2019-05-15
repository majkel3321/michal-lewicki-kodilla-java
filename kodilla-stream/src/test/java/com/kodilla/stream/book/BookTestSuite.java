package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {

    @Test
    public void testGetListUsingFor() {

        BookDirectory bookDirectory = new BookDirectory();

        List<Book> list = bookDirectory.getBookList();
        int publicationYearAfter2007 = 0;

        for (Book loop : list) {
            if (loop.getPublicationYear() > 2007) {
                publicationYearAfter2007++;
            }
        }

        Assert.assertEquals(3, publicationYearAfter2007);
    }

    @Test
    public void testGetListUsingIntStream() {

        BookDirectory bookDirectory = new BookDirectory();

        List<Book> listOfBooks = bookDirectory.getBookList();

       /* int publicationAfter2007 = IntStream.range(0,listOfBooks.size())
                .filter(n -> listOfBooks.get(n).getPublicationYear() > 2007)
                .map(n -> 1)
                .sum();*/

        long publicationAfter2007 = IntStream.range(0, listOfBooks.size())
                .filter(n -> listOfBooks.get(n).getPublicationYear() > 2007)
                .count();

        Assert.assertEquals(3, publicationAfter2007);


    }
}
