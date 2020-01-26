package com.wuan.mango.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Notes
 * @author gaoxiang
 * @date 2020/01/20
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public Object hello() {

        return "hello mango";

    }

}
