package com.wuan.mango.consumer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 服务熔断回调类
 * @author gaoxiang
 * @date 2020/01/27
 */
@Component
public class MangoProducerHystrix implements MangoProducerService {

    @Override
    @RequestMapping("/hello")
    public String hello() {
    	return "sorry, hello service call failed.";
    }
}
