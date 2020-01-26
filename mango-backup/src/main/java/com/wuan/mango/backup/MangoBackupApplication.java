package com.wuan.mango.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动器
 * @author gaoxiang
 * @date 2020/01/23
 */
@SpringBootApplication(scanBasePackages={"com.wuan.mango"})
public class MangoBackupApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangoBackupApplication.class, args);
	}
}