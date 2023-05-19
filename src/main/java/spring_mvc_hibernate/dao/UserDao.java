package spring_mvc_hibernate.dao;

import spring_mvc_hibernate.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    void deleteUserById(long id);

    void addUser(User user);

    void editUser(User user);


    User getUserById(long id);
}