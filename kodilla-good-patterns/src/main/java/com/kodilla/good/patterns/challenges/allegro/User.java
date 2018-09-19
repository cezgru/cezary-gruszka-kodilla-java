package com.kodilla.good.patterns.challenges.allegro;

public class User {
    private String name;
    private String surname;
    private String mail;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }

    public User(String name, String surname, String mail) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
    }
}
