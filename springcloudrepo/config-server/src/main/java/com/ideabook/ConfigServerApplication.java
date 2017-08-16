package com.ideabook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 1、http://localhost:8888/foo/dev
 * 有结果即测试成功！！！！
 * 2、 http://127.0.0.1:8888/config-client/dev
 * 有具体结果
 * 3、http://127.0.0.1:8888/config-client-dev.properties
 * 以上三种都可以

   4、文件命名与访问
	 /{application}/{profile}[/{label}]
	 /{application}-{profile}.yml
	 /{label}/{application}-{profile}.yml
	 /{application}-{profile}.properties
	 /{label}/{application}-{profile}.properties
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
