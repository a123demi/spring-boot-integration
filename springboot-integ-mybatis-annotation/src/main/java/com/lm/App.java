package com.lm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动
 * 
 * @author liangming.deng
 * @date 2017年6月20日
 *
 */

@SpringBootApplication
@MapperScan("com.lm.mapper")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
