/**
 * @(#)UserService.java, 2019-01-07.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.huibin.service;


import com.huibin.meta.po.User;


/**
 * @author 余慧斌(hzyuhuibin @ corp.netease.com)
 */
public interface UserService {

    void save(User user);

    void delete(long id);

    void update(User user);

    User getUserById(int id);
}
