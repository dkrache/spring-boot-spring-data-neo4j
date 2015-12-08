package com.service;

import com.dao.UserDao;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    UserDao userDao;

    public void save(User user) {
        userDao.save(user);
    }

    public long getUsers() {
        return userDao.count();
    }

    public void deleteAll() {
        userDao.deleteAll();
    }
}
