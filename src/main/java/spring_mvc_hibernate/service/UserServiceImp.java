package spring_mvc_hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_mvc_hibernate.dao.UserDao;
import spring_mvc_hibernate.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserDao userDAO;

    @Autowired
    public UserServiceImp (UserDao userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    @Transactional
    public void deleteUserById(long id) {
        userDAO.deleteUserById(id);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    @Transactional
    public void editUser(User user) {
        userDAO.editUser(user);
    }

    @Override
    public User getUserById(long id) {
        return userDAO.getUserById(id);
    }
}