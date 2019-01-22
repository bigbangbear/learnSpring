/**
 * @(#)HelloRESTful.java, 2019-01-21.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.huibin.meta.po;


/**
 * @author 余慧斌(hzyuhuibin @ corp.netease.com)
 */
public class HelloRestful {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HelloRestful(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
