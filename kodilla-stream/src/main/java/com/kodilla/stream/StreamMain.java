package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<ForumUser> someDudes = Forum.getUserList();


        Map<Integer, ForumUser> resultMap = someDudes.stream()
                .filter(user -> user.getSex() == 77)
                .filter(user -> Year.now().getValue() - user.getBirthDate().getYear() > 20)
                .filter(user -> user.getPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        resultMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
