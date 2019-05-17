package com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryA;

public class BookA {

    private final String author;
    private final String title;
    private final int publicationyear;
    private final String signature;

    public BookA(final String author, final String title,
                 final int publicationyear, final String signature) {
        this.author = author;
        this.title = title;
        this.publicationyear = publicationyear;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationyear() {
        return publicationyear;
    }

    public String getSignature() {
        return signature;
    }
}
