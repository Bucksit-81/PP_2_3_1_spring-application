package spring_mvc_hibernate.service;

import spring_mvc_hibernate.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    void deleteUserById(long id);

    void addUser(User user);

    void editUser(User user);
    User getUserById(long id);
}