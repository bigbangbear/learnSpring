/**
 * @(#)UserDao.java, 2019-01-07.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.huibin.dao;


import com.huibin.meta.po.User;

import javax.sql.DataSource;

/**
 * @author 余慧斌(hzyuhuibin @ corp.netease.com)
 */

public interface UserDao {
    void setDataSource(DataSource dataSource);

    void create(User user);

    void delete(long id);

    User findById(long id);

    void update(User user);
}
