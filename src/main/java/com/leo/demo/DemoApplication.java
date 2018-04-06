package com.leo.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.leo.demo.foundation.util.AppContextUtil;

@SpringBootApplication
@MapperScan("com.leo.demo.ds.dao")
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		AppContextUtil.setContext(context);
	}
}
