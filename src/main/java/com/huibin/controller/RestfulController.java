/**
 * @(#)RestController.java, 2019-01-21.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.huibin.controller;

import com.huibin.meta.po.HelloRestful;
import com.huibin.meta.vo.AjaxResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author 余慧斌(hzyuhuibin @ corp.netease.com)
 */
@RestController
@RequestMapping(value = "/rest")
public class RestfulController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/hello.do", method = RequestMethod.GET)
    private AjaxResult sayHelloRestful(@RequestParam(defaultValue = "hello") String name) {
        HelloRestful model = new HelloRestful(counter.get(), name);
        AjaxResult result = new AjaxResult(HttpStatus.OK, model);
        return result;
    }

    @RequestMapping(value = "/add.do", method = RequestMethod.POST)
    private AjaxResult updateHelloCount() {
        long count = counter.incrementAndGet();
        HelloRestful model = new HelloRestful(counter.get(), "count");
        AjaxResult result = new AjaxResult(HttpStatus.OK, model);
        return result;
    }
}
