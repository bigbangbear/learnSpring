/**
 * @(#)Log4JController.java, 2019-01-22.
 * <p/>
 * Copyright 2019 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.huibin.controller;

import com.huibin.meta.vo.AjaxResult;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 余慧斌(hzyuhuibin @ corp.netease.com)
 */
@RestController
@RequestMapping(value = "log")
public class Log4JController {

    private static Logger log = Logger.getLogger(Log4JController.class.getName());

    @RequestMapping("/test.do")
    private AjaxResult printLog() {
        log.info("first print log");
        log.debug("first print log");
        log.error("first print log");
        return new AjaxResult();
    }
}
