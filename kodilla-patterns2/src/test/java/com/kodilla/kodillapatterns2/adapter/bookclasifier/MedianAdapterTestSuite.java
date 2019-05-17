package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryA.BookA;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<BookA> books = new HashSet<>();
        books.add(new BookA("Author1","Title1",1998,"0001"));
        books.add(new BookA("Author2","Title2",1999,"0002"));
        books.add(new BookA("Author3","Title3",2004,"0003"));
        books.add(new BookA("Author4","Title4",2008,"0004"));
        books.add(new BookA("Author5","Title5",2012,"0005"));

        int median = medianAdapter.publicationYearMedian(books);
        System.out.println(median);
        assertEquals(2004,median);

    }
}
