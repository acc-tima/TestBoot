package com.tima.test.service;

import com.tima.test.dao.entity.User;

/**
 * Created by ChenYu on 2017/1/19.
 */
public interface UserService {

    User selectById(Long id);

    void insert(User user);

}
