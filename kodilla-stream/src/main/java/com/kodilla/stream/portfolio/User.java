package com.kodilla.stream.portfolio;

import java.util.Objects;

public final class User {

    private final String realName;
    private final String username;

    public User(final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username);
    }


}
