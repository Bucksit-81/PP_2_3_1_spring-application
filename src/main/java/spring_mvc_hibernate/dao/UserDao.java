package spring_mvc_hibernate.dao;

import spring_mvc_hibernate.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();

    void add(User user);

    User getUserById(Long id);

    void deleteUserById(Long id);

    void updateUser(User user);



}