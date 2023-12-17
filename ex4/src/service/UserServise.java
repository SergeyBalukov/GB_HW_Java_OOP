package service;

import model.User;

public interface UserServise <T extends User> {
    void create(String firstName, String secondName, String  lastName);
}
