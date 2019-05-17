package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryA.BookA;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryA.Clasifier;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryB.BookB;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryB.BookSignature;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Clasifier {


    @Override
    public int publicationYearMedian(Set<BookA> bookASet) {
        Map<BookSignature, BookB> books = new HashMap<>();

        for (BookA book :bookASet){
            books.put(new BookSignature(book.getSignature()),new BookB(book.getAuthor(),book.getTitle(),book.getPublicationyear()));
        }

        return medianPublicationYear(books);
    }
}
