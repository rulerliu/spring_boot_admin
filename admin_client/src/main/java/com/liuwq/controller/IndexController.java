package com.liuwq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/7/4 0004 上午 10:45
 * @version: V1.0
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
