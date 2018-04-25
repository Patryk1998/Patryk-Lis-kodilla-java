package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistic {
    int averagePublicationYear(Map<BookSignature, BookNew> books);
    int medianPublicationYear(Map<BookSignature, BookNew> books);
}
