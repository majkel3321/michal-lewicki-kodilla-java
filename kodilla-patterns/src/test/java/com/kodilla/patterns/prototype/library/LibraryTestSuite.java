package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.library.Book;
import com.kodilla.patterns.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        Library library = new Library("Library 1");

        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Title" + n ,"Author" + n , LocalDate.of(1980 + n,10,22))));



        //Making shallow copy of Library1
        Library shallowCloneLibrary = null;
        try {
            shallowCloneLibrary = library.shallowCopy();
            shallowCloneLibrary.setName("Library 2");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //Making deep copy of Library1
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library 3");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }



        System.out.println(library);
        System.out.println(shallowCloneLibrary);
        System.out.println(deepCloneLibrary);
        Assert.assertEquals(5,library.getBooks().size());
        Assert.assertEquals(library.getBooks(),shallowCloneLibrary.getBooks());
        Assert.assertEquals(library.getBooks(),deepCloneLibrary.getBooks());



    }
}
