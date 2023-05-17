package spring_mvc_hibernate.service;

import spring_mvc_hibernate.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    void add(User user);

    User getUserById(Long id);

    void deleteUserById(Long id);

    void updateUser(User user);


}