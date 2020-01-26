package com.wuan.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author gaoxiang
 * @date 2019/12/21
 */
@SpringBootApplication
@MapperScan(basePackages = "com.wuan.mall.dao")
public class MallApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallApplication.class, args);
	}

}
