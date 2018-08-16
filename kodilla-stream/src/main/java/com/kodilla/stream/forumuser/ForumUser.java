package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int postCount;

    public char getSex() {
        return sex;
    }

    public ForumUser(int userID, String username, LocalDate birthDate, int postCount, boolean sexGen) {
        this.userID = userID;
        this.username = username;
        this.birthDate = birthDate;
        this.postCount = postCount;
        if(sexGen)
            this.sex = 'M';
        else
            this.sex = 'F';
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postCount=" + postCount +
                '}';
    }

    public int getPostCount() {
        return postCount;
    }


}
