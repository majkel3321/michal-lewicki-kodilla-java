package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int signature;
    private final String username;
    private final char sex;
    private final int postsQuantity;
    private final LocalDate dateOfBirth;

    public ForumUser(final int signature, final String username, final char sex,
                     final int postsQuantity, int yearOfBirth, int monthOfBirth, int dayOfBirth) {

        this.signature = signature;
        this.username = username;
        this.sex = sex;
        this.postsQuantity = postsQuantity;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }

    public int getSignature() {
        return signature;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "signature=" + signature +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", postsQuantity=" + postsQuantity +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
