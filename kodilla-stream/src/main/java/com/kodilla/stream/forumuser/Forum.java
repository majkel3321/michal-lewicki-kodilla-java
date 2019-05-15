package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum() {
        listOfUsers.add(new ForumUser(1, "johnsmithh", 'M', 55, 1952, 12, 10));
        listOfUsers.add(new ForumUser(2, "janesmithh", 'F', 551, 2002, 11, 11));
        listOfUsers.add(new ForumUser(3, "maxsmithh", 'M', 5, 1905, 10, 12));
        listOfUsers.add(new ForumUser(4, "debrasmithh", 'F', 11, 1970, 9, 13));
        listOfUsers.add(new ForumUser(5, "jamessmithh", 'M', 44, 1998, 8, 14));
        listOfUsers.add(new ForumUser(6, "skylersmithh", 'F', 0, 1968, 7, 15));
        listOfUsers.add(new ForumUser(7, "michaelsmithh", 'M', 0, 1979, 6, 16));
        listOfUsers.add(new ForumUser(8, "sandrasmithh", 'F', 7, 1997, 5, 17));

    }

    public List<ForumUser> getListOfUsers() {
        return new ArrayList<>(listOfUsers);
    }
}
