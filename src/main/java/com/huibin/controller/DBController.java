/**
 * @(#)DBController.java, 2019-01-23.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.huibin.controller;

import com.huibin.meta.po.User;
import com.huibin.meta.vo.AjaxResult;
import com.huibin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 余慧斌(hzyuhuibin @ corp.netease.com)
 */

@RestController
@RequestMapping(value = "/db")
public class DBController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save.do", method = RequestMethod.POST)
    private AjaxResult saveUser(@RequestParam(value = "name", defaultValue = "name") String name,
                          @RequestParam(value = "age", defaultValue = "1") int age) {
        User user = new User();
        user.setAge(age);
        user.setName(name);
        userService.save(user);
        return new AjaxResult(user);
    }

    @RequestMapping(value = "/user.do")
    private AjaxResult getFirstUser() {
        User user = userService.getUserById(1);
        return new AjaxResult(user);
    }

    @RequestMapping(value = "/delete.do", method = RequestMethod.DELETE)
    private AjaxResult delete(@RequestParam(value = "id", defaultValue = "0") int id) {
        userService.delete(id);
        return new AjaxResult();
    }

    @RequestMapping(value = "/update.do", method = RequestMethod.POST)
    private AjaxResult update(@RequestParam(value = "id", defaultValue = "0") int id) {
        User user = userService.getUserById(id);
        if (user != null) {
            user.setName("test");
            userService.update(user);
            return new AjaxResult(user);
        }
        return new AjaxResult(HttpStatus.BAD_REQUEST);
    }
}
