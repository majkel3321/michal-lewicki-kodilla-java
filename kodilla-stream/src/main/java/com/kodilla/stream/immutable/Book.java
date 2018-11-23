package com.kodilla.stream.immutable;

public final class Book {

    private final String author;
    private final String title;
    private final int publicationYear;

    public Book(final String author, final String title, final int publicationYear){
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;

    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPublicationYear(){
        return publicationYear;
    }


}
