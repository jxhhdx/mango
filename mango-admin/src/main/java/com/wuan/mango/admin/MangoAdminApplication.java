package com.wuan.mango.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 启动类
 * @author gaoxiang
 * @date 2020/1/20
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.wuan.mango"})
public class MangoAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangoAdminApplication.class, args);
	}

}

