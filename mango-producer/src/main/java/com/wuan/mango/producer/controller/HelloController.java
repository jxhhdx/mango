package com.wuan.mango.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Notes
 * @author gaoxiang
 * @date 2020/01/27
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello Mango !";
    }
}
