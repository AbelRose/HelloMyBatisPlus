package com.matrix.controller;

import com.matrix.annotation.LoginRequired;
import com.matrix.annotation.MyLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yihaosun
 * @Date: 2/22/2021 10:50
 */
@RestController
@RequestMapping("/annotation")
public class IndexController {

    @GetMapping("/sourceA")
    public String sourceA() {
        return "你正在访问sourceA资源";
    }

    @LoginRequired
    @GetMapping("/sourceB")
    public String sourceB() {
        return "你正在访问sourceB资源";
    }

    @MyLog
    @GetMapping("/sourceC/{source_name}")
    public String sourceC(@PathVariable("source_name") String sourceName) {
        return "你正在访问sourceC资源";
    }
}
