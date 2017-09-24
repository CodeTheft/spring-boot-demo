package com.spittr.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.spittr.mapper")
@ComponentScan(basePackages = "com.spittr")
public class Application {

	public static void main(String[] args) {
		// 先加载数据库配置类
		SpringApplication.run(Application.class, args);
	}

}
