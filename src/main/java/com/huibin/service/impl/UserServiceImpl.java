/**
 * @(#)UserServiceImpl.java, 2019-01-07.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.huibin.service.impl;

import com.huibin.dao.UserDao;
import com.huibin.meta.po.User;
import com.huibin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author 余慧斌(hzyuhuibin @ corp.netease.com)
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.create(user);
    }

    @Override
    public User getUserById(int id) {
        User user = userDao.findById(id);
        return user;
    }

    @Override
    public void delete(long id) {
        userDao.delete(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }
}
