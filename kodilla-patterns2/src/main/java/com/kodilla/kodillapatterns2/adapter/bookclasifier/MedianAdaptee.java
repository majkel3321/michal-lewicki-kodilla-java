package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryB.BookB;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryB.BookSignature;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryB.BookStatistics;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryB.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {


    @Override
    public int averagePublicationYear(Map<BookSignature, BookB> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, BookB> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
