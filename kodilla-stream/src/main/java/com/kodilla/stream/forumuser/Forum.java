package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    //istnieje na to jakas metoda? google nie znalazl nic


    public static List<ForumUser> getUserList(){
        List<ForumUser> forumUsers = new ArrayList<>();

        for(int i=0; i<20; i++){

            forumUsers.add(new ForumUser(i, ""+i, LocalDate.of(1990+i, (i%12)+1, (1+i*i)%30), i*2, i%2==1));
        }
        return forumUsers;
    }


}
