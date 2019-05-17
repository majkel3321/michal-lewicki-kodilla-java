package com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryB;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, BookB> books);
    int medianPublicationYear(Map<BookSignature, BookB> books);
}
