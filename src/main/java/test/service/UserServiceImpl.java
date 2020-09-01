package test.service;

import test.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.model.User;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {


    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> allUsers() {
        return userDAO.allUsers();
    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Override
    public User getById(int id) {
        return userDAO.getById(id);
    }

    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    public void edit(User user) {
        userDAO.edit(user);
    }
}