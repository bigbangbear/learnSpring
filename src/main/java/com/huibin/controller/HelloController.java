/**
 * @(#)HelloController.java, 2019-01-21.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.huibin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 余慧斌(hzyuhuibin @ corp.netease.com)
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/world")
    private String sayHello() {
        // 输出 WEB-INF/views/hello.jsp
        // dispatcher-servlet.xml 中配置了后缀
        // <property name="suffix" value=".jsp" />
        return "hello";
    }
}
