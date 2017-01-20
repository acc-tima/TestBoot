package com.tima.test.service.impl;

import com.tima.test.dao.dao.UserMapper;
import com.tima.test.dao.entity.User;
import com.tima.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ChenYu on 2017/1/19.
 */
@Service
//@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public void insert(User user) {
        userMapper.insert(user);
    }
}
