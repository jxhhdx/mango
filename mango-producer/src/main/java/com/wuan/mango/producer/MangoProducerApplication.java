package com.wuan.mango.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务消费启动类
 * @author gaoxiang
 * @date 2020/01/27
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MangoProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangoProducerApplication.class, args);
	}
}
