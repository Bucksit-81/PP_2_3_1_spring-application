package spring_mvc_hibernate.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_mvc_hibernate.dao.UserDao;
import spring_mvc_hibernate.model.User;

import java.util.List;


@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void deleteUserById(Long id) {
        userDao.deleteUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }


}