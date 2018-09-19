package com.kodilla.good.patterns.challenges.allegro;

public class MailInformationService implements InformationService{
    public void inform(User user){
        System.out.println("Email confirmation of order sent to address "+ user.getMail());
    }
}
