package com.geebrains.geekchage.hibernate;

public class UsersBuilder {
    private Long id;
    private String name;
    private UserDetails details;

    public UsersBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public UsersBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UsersBuilder setDetails(UserDetails details) {
        this.details = details;
        return this;
    }

    public Users createUsers() {
        return new Users(id, name, details);
    }
}